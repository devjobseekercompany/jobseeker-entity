package org.jobseeker.embedded.master;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jobseeker.embedded.general.ObjectMultiLanguage;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IndustryTypeDataEmbed {
	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private ObjectMultiLanguage name;

	@Field(name = "img")
	private String imgUrl;
}
