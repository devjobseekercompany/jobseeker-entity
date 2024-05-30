package org.jobseeker.embedded.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.mediafile.FileDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private Integer sqlId;

	@Field(name = "thumbnail")
	private String thumbnail;

	@Field(name = "description")
	private String description;

	@Field(name = "file")
	private FileDataEmbed file;

	@Field(name = "created_at")
	private LocalDateTime createdAt;

}
