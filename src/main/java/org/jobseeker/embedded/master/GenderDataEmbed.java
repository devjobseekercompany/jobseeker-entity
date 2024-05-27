package org.jobseeker.embedded.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.ObjectMultiLanguage;
import org.jobseeker.enums.general.Gender;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GenderDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "type")
	private Gender type;

	@Field(name = "name")
	private ObjectMultiLanguage name;

}
