package org.jobseeker.organization.sms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
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
public class SMSVacancyTemplate extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "vacancy_name")
	private String vacancyName;

	@Field(name = "vacancy_name")
	private GeneralDataEmbed department;

	@Field(name = "vacancy_description")
	private String vacancyDescription;

	@Field(name = "vacancy_qualification")
	private String vacancyQualification;

}
