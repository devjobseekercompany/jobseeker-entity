package org.jobseeker.embedded.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
public class RoleDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private String name;

	@Field(name = "code")
	private String code;

	@Field(name = "description")
	private String description;

	@Field(name = "attached_policies")
	private List<PermissionDataEmbed> attachedPolicies;

}
