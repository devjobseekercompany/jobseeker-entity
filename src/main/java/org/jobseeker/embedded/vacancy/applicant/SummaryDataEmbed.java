package org.jobseeker.embedded.vacancy.applicant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SummaryDataEmbed extends GeneralTimestamp {

	@Field(name = "candidate_id", targetType = FieldType.OBJECT_ID)
	private String candidateId;

	@Field(name = "vacancy_ids", targetType = FieldType.OBJECT_ID)
	private List<String> vacancyIds;

	@Field(name = "is_overflow")
	private boolean isOverflow = false;

}
