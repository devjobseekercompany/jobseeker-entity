package org.jobseeker.embedded.vacancy.applicant.activity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.mediafile.FileDataEmbed;
import org.jobseeker.embedded.vacancy.applicant.ApplicantActivityDataEmbed;
import org.jobseeker.embedded.vacancy.applicant.offeringletter.OfferingLetterDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OfferingActivityDataEmbed extends ApplicantActivityDataEmbed {

	@Field(name = "offering_letter")
	private OfferingLetterDataEmbed offeringLetter;

	@Field(name = "offering_letter_signed")
	private FileDataEmbed offeringLetterSigned;
}
