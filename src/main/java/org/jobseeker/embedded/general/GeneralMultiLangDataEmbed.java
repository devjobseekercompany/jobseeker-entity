package org.jobseeker.embedded.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GeneralMultiLangDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
	@JsonSubTypes({
			@JsonSubTypes.Type(name = "String", value = String.class),
			@JsonSubTypes.Type(name = "Object", value = ObjectMultiLanguage.class)
	})
	private Object name;
}