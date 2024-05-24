package org.jobseeker.embedded.organization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.enums.general.GalleryFileType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GalleryDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private int sqlId;

	@Field(name = "order")
	private int order;

	@Field(name = "file")
	private String file;

	@Field(name = "thumbnail")
	private String thumbnail;

	@Field(name = "type")
	private GalleryFileType type;

	@Field(name = "description")
	private String description;

	@Field(name = "createdAt")
	private LocalDateTime createdAt;

}