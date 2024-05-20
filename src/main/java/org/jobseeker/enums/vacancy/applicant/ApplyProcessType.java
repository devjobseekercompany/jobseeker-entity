package org.jobseeker.enums.vacancy.applicant;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public enum ApplyProcessType {

	OFFER(0, new HashMap<>(){{
		put("id", "Ditawarkan");
		put("en", "Offered");
	}}),
	APPLY(1, new HashMap<>(){{
		put("id", "Dilamar");
		put("en", "Applied");
	}}),
	SHORTLIST(21, new HashMap<>(){{
		put("id", "Shortlist");
		put("en", "Shortlist");
	}}),
	REJECT(22, new HashMap<>(){{
		put("id", "Ditolak");
		put("en", "Reject");
	}}),
	WITHDRAW(23, new HashMap<>(){{
		put("id", "Withdraw");
		put("en", "Withdraw");
	}}),
	BLACKLIST(24, new HashMap<>(){{
		put("id", "Blacklist");
		put("en", "Blacklist");
	}}),
	INTERVIEW(3, new HashMap<>(){{
		put("id", "Interview");
		put("en", "Interview");
	}}),
	RESCHEDULE(31, new HashMap<>(){{
		put("id", "Menunggu Jadwal Ulang");
		put("en", "Waiting For Reschedule");
	}}),
	ASSESSMENT(4, new HashMap<>(){{
		put("id", "Penilaian");
		put("en", "Assesment");
	}}),
	OFFERING(5, new HashMap<>(){{
		put("id", "Penawaran");
		put("en", "Offering");
	}}),
	ONBOARDING(6, new HashMap<>(){{
		put("id", "OnBoarding");
		put("en", "OnBoarding");
	}}),
	OTHER(null , null);

	private final Integer applyProcess;
	private final HashMap<String, String> name;
}
