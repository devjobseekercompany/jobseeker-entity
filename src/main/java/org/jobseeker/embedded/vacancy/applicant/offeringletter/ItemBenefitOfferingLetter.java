package org.jobseeker.embedded.vacancy.applicant.offeringletter;

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
public class ItemBenefitOfferingLetter {

	@Field(name = "name")
	public String name;

	@Field(name = "amount")
	public long amount;

}