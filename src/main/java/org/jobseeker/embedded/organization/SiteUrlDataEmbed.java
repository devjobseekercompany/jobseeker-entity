package org.jobseeker.embedded.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class SiteUrlDataEmbed {

	@Field(name = "mode")
	private String mode;

	@Field(name = "url")
	private List<String> url;

}
