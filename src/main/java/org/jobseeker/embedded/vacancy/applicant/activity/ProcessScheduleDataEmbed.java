package org.jobseeker.embedded.vacancy.applicant.activity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ProcessScheduleDataEmbed {

	@NotNull
	@Field(name = "name")
	private String name;

	@NotNull
	@Field(name = "description")
	private String description;

	@NotNull
	@Field(name = "location")
	private String location;

	@NotNull
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}",
			message = "startedAt format must be yyyy-MM-ddThh:mm:ss")
	@Field(name = "started_at")
	private String startedAt;

	@NotNull
	@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}",
			message = "ended format must be yyyy-MM-ddThh:mm:ss")
	@Field(name = "ended_at")
	private String endedAt;

	@NotNull
	@Field(name = "timezone")
	private String timezone;

	@NotEmpty
	@Size(min = 2, max = 10)
	@Field(name = "guests")
	private List<String> guests;

	@NotNull(message = "meet must be filled as boolean")
	@Field(name = "meet")
	private boolean meet = false;

	@Field(name = "link_gmeet")
	private String linkGmeet;

	@Field(name = "gmeet_interview_id")
	private String interviewId;

}