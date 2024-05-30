package org.jobseeker.enums.payroll;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public enum PaymentType {

	WORKING_DAYS(new HashMap<>(){{
		put("id", "Berdasarkan Hari Kerja");
		put("en", "Based on Working Days");
		put("code", "1");
	}}),
	LUMP_SUM(new HashMap<>(){{
		put("id", "Lump Sum");
		put("en", "Lump Sum");
		put("code", "2");
	}});

	private final HashMap<String, String> name;

}