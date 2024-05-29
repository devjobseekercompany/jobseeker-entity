package org.jobseeker.master.area;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.area.CityDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "districts")
@EqualsAndHashCode(callSuper = true)
public class District extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private int sqlId;

	@Field(name = "name")
	private String name;

	@Field(name = "city")
	private CityDataEmbed city;

}
