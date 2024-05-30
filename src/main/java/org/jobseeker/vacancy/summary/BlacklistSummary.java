package org.jobseeker.vacancy.summary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.candidate.CandidateDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "blacklist_summaries")
@EqualsAndHashCode(callSuper = true)
public class BlacklistSummary extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "candidate")
	private CandidateDataEmbed candidate;

	@Field(name = "company")
	private CompanyDataEmbed company;

	@Field(name = "blacklisted_by")
	private GeneralDataEmbed blacklistedBy;

	@Field(name = "blacklist_reason")
	private GeneralDataEmbed blacklistReason;

	@Field(name = "blacklist_date")
	private LocalDateTime blacklistDate;

}
