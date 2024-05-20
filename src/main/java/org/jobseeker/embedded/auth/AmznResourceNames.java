package org.jobseeker.embedded.auth;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
public class AmznResourceNames {

	@Field(name = "api_id")
	private String apiId;

	@Field(name = "region")
	private String region;

	@Field(name = "stage")
	private String stage;
}
