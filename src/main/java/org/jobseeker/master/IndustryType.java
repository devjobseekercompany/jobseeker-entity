package org.jobseeker.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.general.ObjectMultiLanguage;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "industry_types")
@EqualsAndHashCode(callSuper = true)
public class IndustryType extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private ObjectMultiLanguage name;

	@Field(name = "alias")
	private ObjectMultiLanguage alias;

	@Field(name = "linkedin")
	private GeneralDataEmbed linkedin;

	@Field(name = "img")
	private String img;

}