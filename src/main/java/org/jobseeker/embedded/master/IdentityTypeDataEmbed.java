package org.jobseeker.embedded.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.ObjectMultiLanguage;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class IdentityTypeDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private ObjectMultiLanguage name;

	@Field(name = "number")
	private String number;

	@Field(name = "file")
	private String file;

	@Field(name = "expired_date")
	private LocalDate expiredDate;

}
