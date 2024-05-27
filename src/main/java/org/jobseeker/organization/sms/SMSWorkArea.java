package org.jobseeker.organization.sms;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sms_vacancy_template")
@EqualsAndHashCode(callSuper = true)
public class SMSWorkArea extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "code")
	private String code;

	@Field(name = "name")
	private String name;

	@Field(name = "group_code")
	private String groupCode;

	@Field(name = "group_name")
	private String groupName;

}
