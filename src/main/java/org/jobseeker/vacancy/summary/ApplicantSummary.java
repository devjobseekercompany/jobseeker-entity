package org.jobseeker.vacancy.summary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.vacancy.applicant.SummaryDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@SuperBuilder
@Document(collection = "applicant_summaries")
@EqualsAndHashCode(callSuper = true)
public class ApplicantSummary extends SummaryDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

}