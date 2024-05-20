package org.jobseeker.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.auth.PermissionDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.enums.general.StatusData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("roles")
@EqualsAndHashCode(callSuper = true)
public class Role extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Indexed(unique = true)
	@Field(name = "name")
	private String name;

	@Field(name = "code")
	private String code;

	@Field(name = "description")
	private String description;

	@Field(name = "attached_policies")
	private List<PermissionDataEmbed> attachedPolicies;

	@Field(name = "is_default_system")
	private boolean isDefaultSystem = true;

	@Field(name = "status")
	private StatusData status;

}