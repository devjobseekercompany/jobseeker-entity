package org.jobseeker.enums.payroll;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public enum EmploymentTaxStatus {

	PERMANENT(new HashMap<>(){{
		put("id", "Pegawai Tetap");
		put("en", "Permanent Employee");
		put("code", "1");
	}}),
	NON_PERMANENT(new HashMap<>(){{
		put("id", "Pegawai Tidak Tetap");
		put("en", "Non Permanent Employee");
		put("code", "2");
	}});

	private final HashMap<String, String> name;

	public static String getStatusName(String status, String lang) {
		if (status == null) return null;

		for (EmploymentTaxStatus employmentTaxStatus : EmploymentTaxStatus.values()) {
			if (employmentTaxStatus.name().equalsIgnoreCase(status)) {
				return employmentTaxStatus.getName().get(lang);
			}
		}
		return null;
	}
}
