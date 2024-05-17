package org.jobseeker.organization;

import lombok.*;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.jobseeker.embedded.mediafile.FileDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "offering_letter")
@EqualsAndHashCode(callSuper = true)
public class OfferingLetter extends GeneralTimestamp {
	@Id
	private String _id;
	@Field(name = "letter_head")
	private FileDataEmbed letterHead;
	@Field(name = "greetings")
	private String greetings;
	@Field(name = "body")
	private String body;
	@Field(name = "additional_information")
	private String additionalInformation;
	@Field(name = "signee_role")
	private String signeeRole;
	@Field(name = "signee_name")
	private String signeeName;
	@Field(name = "signature")
	private FileDataEmbed signature;

	@Field(name = "company")
	private CompanyDataEmbed company;
}
