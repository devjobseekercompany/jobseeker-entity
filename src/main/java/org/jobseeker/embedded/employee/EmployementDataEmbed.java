package org.jobseeker.embedded.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.attendance.ScheduleDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.organization.BranchDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class EmployementDataEmbed {

	@Field(name = "branch")
	private BranchDataEmbed branch;

	@Field(name = "department")
	private GeneralDataEmbed department;

	@Field(name = "position")
	private GeneralDataEmbed position;

	@Field(name = "job_level")
	private GeneralDataEmbed jobLevel;

	@Field(name = "job_type")
	private GeneralDataEmbed jobType;

	@Field(name = "pic_approval")
	private EmployeeDataEmbed picApproval;

	@Field(name = "schedule")
	private ScheduleDataEmbed schedule;

	@Field(name = "role")
	private GeneralDataEmbed role;

	@Field(name = "leave_balance")
	private double leaveBalance = 12.5;

	@Field(name = "joined_at")
	private LocalDateTime joinedAt;
}
