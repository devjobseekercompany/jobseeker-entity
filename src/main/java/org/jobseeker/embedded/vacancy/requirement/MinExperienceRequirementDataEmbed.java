package org.jobseeker.embedded.vacancy.requirement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MinExperienceRequirementDataEmbed {

	@Field(name = "minimum_experience")
	private Integer minimumExperience;

	@Field(name = "must_meet_criteria")
	private boolean mustMeetCriteria = false;

}
