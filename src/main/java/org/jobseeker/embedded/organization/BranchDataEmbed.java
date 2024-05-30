package org.jobseeker.embedded.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.area.CityDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BranchDataEmbed extends GeneralDataEmbed {

	@Field(name = "city")
	private CityDataEmbed city;

	@Field(name = "coordinate")
	private GeoJsonPoint coordinate;

	@Field(name = "range")
	private int range;

}
