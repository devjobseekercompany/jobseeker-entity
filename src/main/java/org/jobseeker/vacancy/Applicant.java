package org.jobseeker.vacancy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.candidate.CandidateDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.jobseeker.embedded.vacancy.applicant.ApplicantActivityDataEmbed;
import org.jobseeker.embedded.vacancy.applicant.ApplicantCandidateMatch;
import org.jobseeker.embedded.vacancy.VacancyDataEmbed;
import org.jobseeker.enums.general.StatusData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "applicants")
@EqualsAndHashCode(callSuper = true)
public class Applicant extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "company")
	private CompanyDataEmbed company;
	@Field(name = "candidate")
	private CandidateDataEmbed candidate;
	@Field(name = "vacancy")
	private VacancyDataEmbed vacancy;

	@Field(name = "candidate_match")
	private List<ApplicantCandidateMatch> candidateMatch;
	@Field(name = "match_percentage")
	private Long matchPercentage;

	@Field(name = "current_activity")
	private ApplicantActivityDataEmbed currentActivity = new ApplicantActivityDataEmbed();
	@Field(name = "history_activity")
	private List<ApplicantActivityDataEmbed> historyActivity = new ArrayList<>();
	@Field(name = "join_date")
	private String joinDate;

	@Field(name = "is_locked")
	private Boolean isLocked;
	@Field(name = "is_process")
	private Boolean isProcess;

	@Field(name = "count")
	private long count;

	@Field(name = "status")
	private StatusData status;


}
