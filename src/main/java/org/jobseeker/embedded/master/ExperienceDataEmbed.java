package org.jobseeker.embedded.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.candidate.CandidateDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;
	@Field(name = "")
	private Integer _sql_id;

	@Field(name = "company")
	private String companyName;

	@Field(name = "position")
	private String position;
	@Field(name = "job_type")
	private GeneralMultiLangDataEmbed jobType;
	@Field(name = "job_description")
	private String jobDescription;
	@Field(name = "salary")
	private int salary = 0;

	@Field(name = "start_date")
	private Instant startDate;
	@Field(name = "end_date")
	private Instant endDate;
	@Field(name = "working_period_in_months")
	private int workingPeriodInMonths = 0;

	@Field(name = "is_still_work_here")
	private boolean isStillWorkHere = false;
	@Field(name = "reason_resign")
	private String reasonResign;
	@Field(name = "achievement")
	private String achievement;

	@Field(name = "logo")
	private String logo;
	@Field(name = "address")
	private String address;
	@Field(name = "industry_type")
	private IndustryTypeDataEmbed industryType;

	@Field(name = "province")
	private GeneralDataEmbed province;
	@Field(name = "city")
	private GeneralDataEmbed city;
	@Field(name = "district")
	private GeneralDataEmbed district;
	@Field(name = "sub_district")
	private GeneralDataEmbed subDistrict;

	@Field(name = "total_account_in_this_company")
	private int totalAccountInThisCompany;
	@Field(name = "accounts_in_this_company")
	private List<CandidateDataEmbed> accountsInThisCompany = new ArrayList<>();

}
