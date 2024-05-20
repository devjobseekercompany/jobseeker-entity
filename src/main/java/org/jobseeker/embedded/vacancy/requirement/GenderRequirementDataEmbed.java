package org.jobseeker.embedded.vacancy.requirement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.jobseeker.enums.general.Gender;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class GenderRequirementDataEmbed extends GeneralMultiLangDataEmbed {

	@Field(name = "type")
	private Gender type;

	@Field(name = "must_meet_criteria")
	private boolean mustMeetCriteria = false;

}
