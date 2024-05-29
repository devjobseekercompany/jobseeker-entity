package org.jobseeker.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
@Document(collection = "disabilities")
@EqualsAndHashCode(callSuper = true)
public class Disability extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private ObjectMultiLanguage name;

}