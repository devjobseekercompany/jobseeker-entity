package org.jobseeker.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.bson.types.ObjectId;
import org.jobseeker.embedded.auth.PermissionDataEmbed;
import org.jobseeker.embedded.auth.RoleDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document("users")
@EqualsAndHashCode(callSuper = true)
public class User extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "username")
	private String username;

	@Field(name = "first_name")
	private String firstName;

	@Field(name = "last_name")
	private String lastName;

	@Indexed(unique = true)
	@Field(name = "email")
	private String email;

	@Field(name = "password")
	private String password;

	@Field(name = "access_granted")
	private List<RoleDataEmbed> accessGranted;

	@Indexed
	@Field(name = "access_direct_permissions")
	private List<PermissionDataEmbed> accessDirectPermissions;

	@Field(name = "candidate_id")
	private ObjectId candidateId;
	@Field(name = "company_id")
	private ObjectId companyId;
	@Field(name = "employee_id")
	private ObjectId employeeId;

	@Field(name = "on_boarding")
	private Boolean onBoarding;

	@Field(name = "forgot_password_token")
	private String forgotPasswordToken;
	@Field(name = "forgot_password_key")
	private String forgotPasswordKey;
}
