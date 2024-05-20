package org.jobseeker.embedded.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
public class PermissionDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Indexed
	@Field(name = "method")
	private String method;

	@Indexed
	@Field(name = "path")
	private String path;

	@Field(name = "name")
	private String name;

	@Field(name = "group_name")
	private String groupName;

	@Field(name = "action")
	private String action;

	@Indexed
	@Field(name = "resource")
	private AmznResourceNames resource;

}
