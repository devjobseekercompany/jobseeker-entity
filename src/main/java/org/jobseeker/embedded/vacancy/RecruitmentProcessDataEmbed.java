package org.jobseeker.embedded.vacancy;


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
public class RecruitmentProcessDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private String name;

	@Field(name = "type")
	private String type;

	@Field(name = "seq")
	private int seq = 0;

}
