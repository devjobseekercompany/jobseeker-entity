package org.jobseeker.organization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.enums.general.StatusData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "work_placement_types")
@EqualsAndHashCode(callSuper = true)
public class Workplacement extends GeneralTimestamp {
	@Id
	@JsonProperty("oid")
	private String _id;
	@Field(name = "name")
	private String name;
	@Field(name = "status")
	private StatusData status;

	@Field(name = "company")
	private CompanyDataEmbed company;
}