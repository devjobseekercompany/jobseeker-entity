package org.jobseeker.embedded.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class HistoryInactiveDataEmbed {

	@Field(name = "reason_inactive")
	private String reasonInactive;

	@Field(name = "lastday_at")
	private LocalDateTime lastdayAt;

	@Field(name = "last_job_type_before_inactive")
	private GeneralDataEmbed lastJobTypeBeforeInactive;

}