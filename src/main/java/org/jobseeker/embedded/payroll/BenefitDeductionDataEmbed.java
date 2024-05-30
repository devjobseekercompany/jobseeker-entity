package org.jobseeker.embedded.payroll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.payroll.benefitdeduction.BenefitDeductionComponent;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BenefitDeductionDataEmbed {

	@Field(name = "benefits")
	private List<BenefitDeductionComponent> benefits;

	@Field(name = "deductions")
	private List<BenefitDeductionComponent> deductions;

}
