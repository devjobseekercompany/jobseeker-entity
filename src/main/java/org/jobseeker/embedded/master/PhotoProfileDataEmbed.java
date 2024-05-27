package org.jobseeker.embedded.master;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.mediafile.MediaDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PhotoProfileDataEmbed extends MediaDataEmbed {

	@Field(name = "check_photo")
	private Boolean checkPhoto;

	@Field(name = "photo_validation")
	private Boolean photoValidation;

}
