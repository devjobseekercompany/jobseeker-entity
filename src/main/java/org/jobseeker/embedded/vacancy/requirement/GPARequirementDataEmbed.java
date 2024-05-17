package org.jobseeker.embedded.vacancy.requirement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GPARequirementDataEmbed {

	@Field(name = "minimum_gpa")
	private Double minimumGpa;

	@Field(name = "must_meet_criteria")
	private boolean mustMeetCriteria = false;

}
