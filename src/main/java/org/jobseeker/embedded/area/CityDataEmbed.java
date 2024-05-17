package org.jobseeker.embedded.area;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CityDataEmbed {
	@Id
	private String _id;

	@Field(name = "name")
	private String name;

	@Field(name = "code")
	private String code;

	@Field(name = "coordinate")
	private GeoJsonPoint coordinate;
}
