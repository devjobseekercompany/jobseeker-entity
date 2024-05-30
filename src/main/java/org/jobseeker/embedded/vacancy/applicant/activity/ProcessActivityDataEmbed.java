package org.jobseeker.embedded.vacancy.applicant.activity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.employee.EmployeeDataEmbed;
import org.jobseeker.embedded.mediafile.FileDataEmbed;
import org.jobseeker.embedded.vacancy.applicant.ApplicantActivityDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProcessActivityDataEmbed extends ApplicantActivityDataEmbed {

	@Field(name = "notes")
	private String notes;

	@Field(name = "file")
	private FileDataEmbed file;

	@Field(name = "attendees")
	private List<EmployeeDataEmbed> attendees;

	@Field(name = "schedules")
	private List<ProcessScheduleDataEmbed> schedules;
}
