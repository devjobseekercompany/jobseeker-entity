package org.jobseeker.embedded.candidate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CandidateLegacyDataEmbed {

	@Field(name = "flag_update")
	private String flagUpdate;

	@Field(name = "phone_number_area")
	private String phoneNumberArea;

	@Field(name = "registered_from")
	private String registeredFrom;

	@Field(name = "is_dummy")
	private String isDummy;

}