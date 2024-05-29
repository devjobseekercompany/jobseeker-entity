package org.jobseeker.enums.payroll;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaxMethod {

	GROSS("Gross"),
	GROSS_UP("Gross Up"),
	NET("Netto");

	private final String label;
}