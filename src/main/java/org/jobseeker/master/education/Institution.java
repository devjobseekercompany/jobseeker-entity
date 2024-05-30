package org.jobseeker.master.education;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.general.ObjectMultiLanguage;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "institutions")
@EqualsAndHashCode(callSuper = true)
public class Institution extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private int sqlId;

	@Field(name = "name")
	private ObjectMultiLanguage name;

	@Field(name = "alias")
	private ObjectMultiLanguage alias;

	@Field(name = "linkedin")
	private ObjectMultiLanguage linkedin;

	@Field(name = "img")
	private String img;

}
