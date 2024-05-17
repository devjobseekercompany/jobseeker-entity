package org.jobseeker.embedded.vacancy.requirement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProvinceRequirementDataEmbed extends GeneralDataEmbed {

	@Field(name = "must_meet_criteria")
	private boolean mustMeetCriteria = false;

}