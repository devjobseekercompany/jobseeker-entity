package org.jobseeker.embedded.attendance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleItemDataEmbed {

	@Field(name = "day")
	private int day = 0;

	@Field(name = "start")
	private String start;

	@Field(name = "end")
	private String end;

	@Field(name = "is_active")
	private Boolean isActive = false;
}
