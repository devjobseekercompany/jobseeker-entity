package org.jobseeker.organization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.employee.EmployeeDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "approvals")
@EqualsAndHashCode(callSuper = true)
public class Approval extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "employee")
	private EmployeeDataEmbed employee;

	@Field(name = "employee")
	private GeneralDataEmbed position;

	@Field(name = "employee")
	private GeneralDataEmbed department;

	@Field(name = "employee")
	private GeneralDataEmbed branch;

	@Field(name = "employee")
	private CompanyDataEmbed company;

	@Field(name = "employee")
	private int status;

}