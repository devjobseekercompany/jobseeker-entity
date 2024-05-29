package org.jobseeker.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.general.ObjectMultiLanguage;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "job_functions")
@EqualsAndHashCode(callSuper = true)
public class JobFunction extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private int sqlId;

	@Field(name = "category")
	private GeneralMultiLangDataEmbed category;

	@Field(name = "name")
	@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
	@JsonSubTypes({
			@JsonSubTypes.Type(name = "String", value = String.class),
			@JsonSubTypes.Type(name = "Object", value = ObjectMultiLanguage.class)
	})
	private ObjectMultiLanguage name;

	@Field(name = "image_url")
	private String imageUrl;

	@Field(name = "is_default")
	private boolean isDefault;

	@Field(name = "company")
	private CompanyDataEmbed company;

}
