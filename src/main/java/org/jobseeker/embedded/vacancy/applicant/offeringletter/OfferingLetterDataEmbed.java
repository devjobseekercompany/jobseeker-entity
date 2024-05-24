package org.jobseeker.embedded.vacancy.applicant.offeringletter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class OfferingLetterDataEmbed {

	@Field(name = "letter_number")
	private String letterNumber;

	@Field(name = "position")
	private GeneralDataEmbed position;

	@Field(name = "department")
	private GeneralDataEmbed department;

	@Field(name = "job_level")
	private GeneralDataEmbed jobLevel;

	@Field(name = "job_type")
	private GeneralDataEmbed jobType;

	@Field(name = "city")
	private GeneralDataEmbed city;

	@Field(name = "join_date")
	private String joinDate;

	@Field(name = "expiry_date")
	private String expiryDate;

	@Field(name = "base_salary")
	private long baseSalary;

	@Field(name = "benefits")
	private List<ItemBenefitOfferingLetter> benefits;

	@Field(name = "created_at")
	private LocalDateTime createdAt;

}