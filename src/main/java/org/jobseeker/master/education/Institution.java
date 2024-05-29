package org.jobseeker.master.education;

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
@Document(collection = "institutions")
@EqualsAndHashCode(callSuper = true)
public class Institution extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_id")
	private int sqlId;
}
