package org.jobseeker.embedded.candidate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CandidateScoreDataEmbed extends GeneralDataEmbed {

	@Field(name = "_sql_id")
	private Integer sqlId;

	@Field(name = "score")
	private int score;

	@Field(name = "created_at")
	private LocalDateTime createdAt;

}
