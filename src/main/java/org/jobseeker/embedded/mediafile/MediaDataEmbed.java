package org.jobseeker.embedded.mediafile;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MediaDataEmbed extends FileDataEmbed {

    @Field(name = "thumbnail")
    private String thumbnail;

}