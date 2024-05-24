package org.jobseeker.embedded.mediafile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.enums.general.MimeType;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FileDataEmbed {

	@Field(name = "link")
	private String link;

	@Field(name = "mime_type")
	private MimeType mimeType;

}