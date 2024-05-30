package org.jobseeker.employee;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.employee.EmployementDataEmbed;
import org.jobseeker.embedded.employee.HistoryInactiveDataEmbed;
import org.jobseeker.embedded.employee.PersonalDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.jobseeker.embedded.payroll.BenefitDeductionDataEmbed;
import org.jobseeker.embedded.payroll.PayrollDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employees")
@EqualsAndHashCode(callSuper = true)
public class Employee extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;
	@Field(name = "name")
	private String name;
	@Field(name = "email")
	private String email;
	@Field(name = "employee_code")
	private String employeeCode;
	@Field(name = "company")
	private CompanyDataEmbed company;

	@Field(name = "personal_data")
	private PersonalDataEmbed personalData;
	@Field(name = "employment")
	private EmployementDataEmbed employment;
	@Field(name = "payroll")
	private PayrollDataEmbed payroll;
	@Field(name = "components")
	private BenefitDeductionDataEmbed components;

	@Field(name = "status")
	private Integer status;
	@Field(name = "reason_inactive")
	private String reasonInactive;
	@Field(name = "terminated_by")
	private GeneralDataEmbed terminatedBy;
	@Field(name = "lastday_at")
	private LocalDateTime lastdayAt;
	@Field(name = "last_job_type_before_inactive")
	private GeneralDataEmbed lastJobTypeBeforeInactive;
	@Field(name = "history_inactive")
	private List<HistoryInactiveDataEmbed> historyInactive;
}
