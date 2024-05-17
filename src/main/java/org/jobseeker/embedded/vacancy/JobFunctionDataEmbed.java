package org.jobseeker.embedded.vacancy;


import lombok.*;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class JobFunctionDataEmbed extends GeneralMultiLangDataEmbed {
	@Field(name = "image")
	private String image;
}
