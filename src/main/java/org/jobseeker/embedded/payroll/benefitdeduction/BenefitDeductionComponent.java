package org.jobseeker.embedded.payroll.benefitdeduction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.enums.payroll.AmountType;
import org.jobseeker.enums.payroll.PaymentType;
import org.jobseeker.enums.payroll.TaxType;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BenefitDeductionComponent {

	@Field(name = "item_component")
	private GeneralDataEmbed itemComponent;

	@Field(name = "tax_type")
	private TaxType taxType;

	@Field(name = "amount_type")
	private AmountType amountType;

	@Field(name = "amount")
	private double amount;

	@Field(name = "max_cap")
	private double maxCap;

	@Field(name = "application_type")
	private PaymentType applicationType;

}
