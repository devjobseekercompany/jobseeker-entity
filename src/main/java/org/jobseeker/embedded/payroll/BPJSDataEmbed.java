package org.jobseeker.embedded.payroll;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.payroll.bpjs.BPJSComponent;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BPJSDataEmbed {

	@Field(name = "bpjs_ketenagakerjaan")
	@JsonProperty("bpjsKetenagakerjaanNumber")
	private String bpjsKetenagakerjaan;

	@Field(name = "bpjs_kesehatan")
	@JsonProperty("bpjsKesehatanNumber")
	private String bpjsKesehatan;

	@Field(name = "paid_by_employer")
	private BPJSComponent paidByEmployer;

	@Field(name = "paid_by_employee")
	private BPJSComponent paidByEmployee;

}