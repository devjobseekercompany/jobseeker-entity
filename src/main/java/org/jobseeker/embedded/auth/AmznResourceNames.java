package org.jobseeker.embedded.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AmznResourceNames {

	@Field(name = "api_id")
	private String apiId;

	@Field(name = "region")
	private String region;

	@Field(name = "stage")
	private String stage;
}
