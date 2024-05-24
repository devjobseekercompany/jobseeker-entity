package org.jobseeker.embedded.mediafile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MediaDataEmbed {

    @Field(name = "file")
    private String file;

    @Field(name = "thumbnail")
    private String thumbnail;

}