package org.jobseeker.master.area;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cities")
@EqualsAndHashCode(callSuper = true)
public class City extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_b2b_id")
	private int sqlB2BId;

	@Field(name = "_sql_b2c_id")
	private int sqlB2CId;

	@Field(name = "name")
	private String name;

	@Field(name = "coordinate")
	private GeoJsonPoint coordinate;

	@Field(name = "province")
	private GeneralDataEmbed province;

	@Field(name = "country")
	private GeneralDataEmbed country;

}