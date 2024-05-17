package org.jobseeker.embedded.vacancy.requirement;


import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.area.CityDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CityRequirementDataEmbed extends CityDataEmbed {

	@Field(name = "must_meet_criteria")
	private boolean mustMeetCriteria = false;

}
