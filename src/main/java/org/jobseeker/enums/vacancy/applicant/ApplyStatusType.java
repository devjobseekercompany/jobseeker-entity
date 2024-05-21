package org.jobseeker.enums.vacancy.applicant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter
@AllArgsConstructor
public enum ApplyStatusType {

	WAITING(new HashMap<>(){{
		put("id", "Menunggu");
		put("en", "Waiting");
	}}),
	ACCEPTED(new HashMap<>(){{
		put("id", "Diterima");
		put("en", "Accepted");
	}}),
	REJECTED(new HashMap<>(){{
		put("id", "Ditolak");
		put("en", "Rejected");
	}}),
	PROCESS(new HashMap<>(){{
		put("id", "Proses");
		put("en", "Failed");
		put("code", "0");
	}}),
	PASSED(new HashMap<>(){{
		put("id", "Lolos");
		put("en", "Passed");
		put("code", "1");
	}}),
	FAILED(new HashMap<>(){{
		put("id", "Gagal");
		put("en", "Failed");
		put("code", "2");
	}}),
	WAITING_DOCUMENTS(new HashMap<>(){{
		put("id", "Menunggu Dokumen");
		put("en", "Waiting for Documents");
		put("code", "3");
		put("step-ol", "1");
	}}),
	READY_TO_OFFER(new HashMap<>(){{
		put("id", "Siap Ditawar");
		put("en", "Ready to Offer");
		put("code", "4");
		put("step-ol", "2");
	}}),
	OFFERING_SENT(new HashMap<>(){{
		put("id", "Telah Dikirim");
		put("en", "Offering Letter Sent");
		put("code", "5");
		put("step-ol", "3");
	}}),
	OFFERING_SIGN(new HashMap<>(){{
		put("id", "Telah Ditandatangani");
		put("en", "Offering Signed");
		put("code", "6");
	}}),
	WAITING_TO_JOIN(new HashMap<>(){{
		put("id", "Menunggu Bergabung");
		put("en", "Waiting to Join");
		put("code", "7");
	}}),
	HIRED(new HashMap<>(){{
		put("id", "Telah Bergabung");
		put("en", "Hired");
		put("code", "8");
	}});

	private final HashMap<String, String> name;

	public static String getStatusName(String status, String lang) {
		if (status == null) return null;

		for (ApplyStatusType activityStatus : ApplyStatusType.values()) {
			if (activityStatus.toString().equals(status)) {
				return activityStatus.getName().get(lang);
			}
		}
		return null;
	}

	public static String getStatusCode(String status) {
		if (status == null) return null;

		for (ApplyStatusType activityStatus : ApplyStatusType.values()) {
			if (activityStatus.toString().equals(status)) {
				return activityStatus.getName().get("code");
			}
		}
		return null;
	}

	public static int getStatusStepOL(String status) {
		for (ApplyStatusType activityStatus : ApplyStatusType.values()) {
			if (activityStatus.toString().equals(status)) {
				return Integer.parseInt(activityStatus.getName().get("step-ol"));
			}
		}
		return 0;
	}

	public static ApplyStatusType getStatus(String status) {
		if (status == null) return null;

		for (ApplyStatusType activityStatus : ApplyStatusType.values()) {
			if (activityStatus.toString().equals(status)) {
				return activityStatus;
			}
		}
		return null;
	}
}