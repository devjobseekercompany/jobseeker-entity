package org.jobseeker.vacancy.summary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.vacancy.applicant.SummaryDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "shortlist_summaries")
@EqualsAndHashCode(callSuper = true)
public class ShortlistSummary extends SummaryDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

}