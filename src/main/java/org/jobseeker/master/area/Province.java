package org.jobseeker.master.area;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.area.CountryDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "provinces")
@EqualsAndHashCode(callSuper = true)
public class Province extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "_sql_b2b_id")
	private int sqlB2BId;

	@Field(name = "_sql_b2c_id")
	private int sqlB2CId;

	@Field(name = "name")
	private String name;

	@Field(name = "country")
	private CountryDataEmbed country;

}
