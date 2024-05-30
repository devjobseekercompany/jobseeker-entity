package org.jobseeker.master.area;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "countries")
@EqualsAndHashCode(callSuper = true)
public class Country extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private int sqlId;

	@Field(name = "name")
	private String name;

	@Field(name = "code")
	private String code;

	@Field(name = "calling_code")
	private String callingCode;

	@Field(name = "region")
	private String region;

	@Field(name = "sub_region")
	private String subRegion;

}