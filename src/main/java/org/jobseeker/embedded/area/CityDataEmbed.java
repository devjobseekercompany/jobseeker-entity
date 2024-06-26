package org.jobseeker.embedded.area;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CityDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private String name;

	@Field(name = "coordinate")
	private GeoJsonPoint coordinate;

}
