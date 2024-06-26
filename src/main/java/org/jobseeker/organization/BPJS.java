package org.jobseeker.organization;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.jobseeker.embedded.payroll.bpjs.BPJSComponent;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "bpjs")
@EqualsAndHashCode(callSuper = true)
public class BPJS extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "company")
	private CompanyDataEmbed company;

	@Field(name = "paid_by_employer")
	private BPJSComponent paidByEmployer;

	@Field(name = "paid_by_employee")
	private BPJSComponent paidByEmployee;

}