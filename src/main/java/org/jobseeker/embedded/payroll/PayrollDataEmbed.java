package org.jobseeker.embedded.payroll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.enums.payroll.PaymentType;
import org.jobseeker.enums.payroll.TaxMethod;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PayrollDataEmbed {

	@Field(name = "tax_method")
	private TaxMethod taxMethod;

	@Field(name = "base_salary")
	private long baseSalary;

	@Field(name = "base_salary_type")
	private PaymentType paymentType;

	@Field(name = "is_allow_overtime")
	private boolean allowOvertime = false;

	@Field(name = "bank")
	private BankInfoDataEmbed bank;

	@Field(name = "tax_config")
	private TaxConfigDataEmbed taxConfig;

	@Field(name = "is_participate_bpjs")
	private boolean isParticipateBpjs = false;

	@Field(name = "bpjs")
	private BPJSDataEmbed bpjs;

}
