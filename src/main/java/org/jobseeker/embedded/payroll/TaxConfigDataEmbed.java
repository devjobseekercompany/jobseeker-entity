package org.jobseeker.embedded.payroll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.enums.payroll.EmploymentTaxStatus;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class TaxConfigDataEmbed {

	@Field(name = "tax_status")
	private EmploymentTaxStatus taxStatus;

	@Field(name = "npwp_number")
	private String npwpNumber;

	@Field(name = "ptkp_status")
	private String ptkpStatus;

	@Field(name = "category")
	private String category;
}