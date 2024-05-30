package org.jobseeker.organization.sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.organization.Branch;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SMSBranch extends Branch {

	@Field(name = "code")
	private String code;

	@Field(name = "group_code")
	private String groupCode;

	@Field(name = "group_name")
	private String groupName;

}
