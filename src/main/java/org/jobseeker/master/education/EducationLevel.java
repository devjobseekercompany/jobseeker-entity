package org.jobseeker.master.education;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.general.ObjectMultiLanguage;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "education_levels")
@EqualsAndHashCode(callSuper = true)
public class EducationLevel extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private int sqlId;

	@Field(name = "name")
	private ObjectMultiLanguage name;

	@Field(name = "is_default")
	private boolean isDefault;

}