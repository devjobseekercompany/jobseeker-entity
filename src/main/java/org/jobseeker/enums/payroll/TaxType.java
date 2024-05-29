package org.jobseeker.enums.payroll;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaxType {

	TAXABLE("Taxable"),
	NON_TAXABLE("Non Taxable");

	private final String label;

}