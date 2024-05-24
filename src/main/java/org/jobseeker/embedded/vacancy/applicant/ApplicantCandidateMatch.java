package org.jobseeker.embedded.vacancy.applicant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.enums.vacancy.RequirementCandidateMatch;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantCandidateMatch {

	@Field(name = "requirement_type")
	private RequirementCandidateMatch requirementType;

	@Field(name = "vacancy_data")
	private String vacancyData;

	@Field(name = "candidate_data")
	private String candidateData;

	@Field(name = "is_match")
	private Boolean isMatch;

	@Field(name = "is_mandatory")
	private Boolean isMandatory;

}