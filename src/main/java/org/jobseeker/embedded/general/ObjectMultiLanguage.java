package org.jobseeker.embedded.general;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ObjectMultiLanguage {
	@Field(name = "en")
	private String en;

	@Field(name = "id")
	private String id;
}
