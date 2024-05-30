package org.jobseeker.embedded.candidate;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.mediafile.MediaDataEmbed;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class VideoResumeDataEmbed extends MediaDataEmbed {
}
