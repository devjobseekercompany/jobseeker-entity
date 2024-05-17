package org.jobseeker.embedded.vacancy.requirement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AgeRequirementDataEmbed extends GeneralMultiLangDataEmbed {

	@Field(name = "minimum_age")
	private Integer minimumAge;

	@Field(name = "maximum_age")
	private Integer maximumAge;

	@Field(name = "must_meet_criteria")
	private boolean mustMeetCriteria = false;

}
