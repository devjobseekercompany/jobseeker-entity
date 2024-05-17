package org.jobseeker.embedded.mediafile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jobseeker.enums.MimeType;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileDataEmbed {
	@Field(name = "link")
	private String link;

	@Field(name = "mime_type")
	private MimeType mimeType;
}