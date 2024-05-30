package org.jobseeker.embedded.payroll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BankInfoDataEmbed {

	@Field(name = "bank_name")
	private String bankName;

	@Field(name = "account_number")
	private String accountNumber;

	@Field(name = "account_holder_name")
	private String accountHolderName;

}