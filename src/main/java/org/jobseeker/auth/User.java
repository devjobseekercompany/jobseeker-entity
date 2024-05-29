package org.jobseeker.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.auth.PermissionDataEmbed;
import org.jobseeker.embedded.auth.RoleDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

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

	@Field(name = "candidate_id", targetType = FieldType.OBJECT_ID)
	private String candidateId;
	@Field(name = "company_id", targetType = FieldType.OBJECT_ID)
	private List<String> companyId;
	@Field(name = "employee_id", targetType = FieldType.OBJECT_ID)
	private List<String> employeeId;

	@Field(name = "on_boarding")
	private Boolean onBoarding;

	@Field(name = "forgot_password_token")
	private String forgotPasswordToken;
	@Field(name = "forgot_password_key")
	private String forgotPasswordKey;
}
