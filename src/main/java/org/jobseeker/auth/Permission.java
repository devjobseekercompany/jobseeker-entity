package org.jobseeker.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.auth.AmznResourceNames;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.jobseeker.enums.general.StatusData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("permissions")
@EqualsAndHashCode(callSuper = true)
public class Permission extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private String name;

	@Field(name = "group_name")
	private String groupName;

	@Field(name = "method")
	private String method;

	@Field(name = "path")
	private String path;

	@Field(name = "action")
	private String action;

	@Field(name = "resource")
	private AmznResourceNames resource;

	@Field(name = "is_default_system")
	private boolean isDefaultSystem = true;

	@Field(name = "company")
	private CompanyDataEmbed company;

	@Field(name = "status")
	private StatusData status;
}