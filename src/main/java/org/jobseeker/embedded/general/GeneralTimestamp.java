package org.jobseeker.embedded.general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GeneralTimestamp {

	@Field(name = "created_at")
	private LocalDateTime createdAt;

	@Field(name = "updated_at")
	private LocalDateTime updatedAt;

	@Field(name = "deleted_at")
	private LocalDateTime deletedAt;

}