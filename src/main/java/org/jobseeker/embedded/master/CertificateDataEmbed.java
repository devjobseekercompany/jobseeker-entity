package org.jobseeker.embedded.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.mediafile.FileDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CertificateDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private Integer sqlId;

	@Field(name = "name")
	private String name;

	@Field(name = "logo")
	private String logo;

	@Field(name = "file")
	private FileDataEmbed file;

	@Field(name = "start_date")
	private Instant startDate;

	@Field(name = "expired_date")
	private Instant expiredDate;

	@Field(name = "active")
	private Boolean active;

	@Field(name = "is_valid_for_life")
	private Boolean isValidForLife;

	@Field(name = "location")
	private String location;

	@Field(name = "organizer")
	private String organizer;

	@Field(name = "description")
	private String description;

}