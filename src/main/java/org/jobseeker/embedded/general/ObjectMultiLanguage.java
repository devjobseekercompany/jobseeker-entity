package org.jobseeker.embedded.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ObjectMultiLanguage {

	@Field(name = "en")
	private String en;

	@Field(name = "id")
	private String id;

}
