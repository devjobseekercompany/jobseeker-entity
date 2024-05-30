package org.jobseeker.embedded.payroll.bpjs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.enums.payroll.TaxType;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BPJSItemComponent {

	@Field(name = "rate")
	private double rate;

	@Field(name = "max_cap")
	private Long maxCap;

	@Field(name = "tax_type")
	private TaxType taxType;

}