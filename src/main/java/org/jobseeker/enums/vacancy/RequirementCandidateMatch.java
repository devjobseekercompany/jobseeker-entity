package org.jobseeker.enums.vacancy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public enum RequirementCandidateMatch {

	MINIMUM_EDUCATION(new HashMap<>(){{
		put("id", "Pendidikan Minimal");
		put("en", "Minimum Education");
	}}),
	MAXIMUM_SALARY(new HashMap<>(){{
		put("id", "Gaji Maksimal");
		put("en", "Maximum Salary");
	}}),
	GENDER(new HashMap<>(){{
		put("id", "Jenis Kelamin");
		put("en", "Gender");
	}}),
	MINIMUM_EXPERIENCE(new HashMap<>(){{
		put("id", "Pengalaman Minimal");
		put("en", "Minimal Experience");
	}}),
	MINIMUM_AGE(new HashMap<>(){{
		put("id", "Umur Minimal");
		put("en", "Minimum Age");
	}}),
	GPA(new HashMap<>(){{
		put("id", "GPA");
		put("en", "GPA");
	}}),
	PROVINCE(new HashMap<>(){{
		put("id", "Provinsi");
		put("en", "Province");
	}}),
	CITY(new HashMap<>(){{
		put("id", "Kota");
		put("en", "City");
	}});

	private final HashMap<String, String> alias;
}
