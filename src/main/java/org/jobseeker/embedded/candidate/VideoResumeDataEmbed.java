package org.jobseeker.embedded.candidate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.mediafile.MediaDataEmbed;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class VideoResumeDataEmbed extends MediaDataEmbed {
}
