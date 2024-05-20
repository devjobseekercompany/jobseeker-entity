package org.jobseeker.embedded.vacancy.applicant;

import lombok.*;
import org.bson.types.ObjectId;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.enums.vacancy.applicant.ApplyProcessType;
import org.jobseeker.enums.vacancy.applicant.ApplyStatusType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ApplicantActivityDataEmbed extends GeneralTimestamp {

	@Id
	private ObjectId _id;

	@Field(name = "apply_process")
	private ApplyProcessType applyProcess;

	@Field(name = "status")
	private ApplyStatusType status;

	@Field(name = "type")
	private String type;

	@Field(name = "from")
	private String from = "HRMS.Basic";

	@Field(name = "in_review")
	private Boolean inReview;

	@Field(name = "actionAt")
	private LocalDateTime actionAt;

}