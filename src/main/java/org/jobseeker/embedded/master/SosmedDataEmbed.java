package org.jobseeker.embedded.master;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class SosmedDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private int sqlIid;

	@Field(name = "provider")
	private String provider;

	@Field(name = "username")
	private String username;

}
