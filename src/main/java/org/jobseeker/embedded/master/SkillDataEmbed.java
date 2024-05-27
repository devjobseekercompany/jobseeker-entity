package org.jobseeker.embedded.master;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class SkillDataEmbed {

	@Field(name = "_sql_id")
	private Integer sqlId;

	@Field(name = "description")
	private String description;

	@Field(name = "level_understanding")
	private int levelUnderstanding;

}
