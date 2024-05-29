package org.jobseeker.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "video_tutorials")
@EqualsAndHashCode(callSuper = true)
public class VideoTutorial extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "video")
	private String video;

	@Field(name = "thumbnail")
	private String thumbnail;

	@Field(name = "order")
	private Integer order;

	@Field(name = "show_in")
	private String showIn;

}