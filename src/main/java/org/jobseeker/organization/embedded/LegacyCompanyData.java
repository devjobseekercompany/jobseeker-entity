package org.jobseeker.organization.embedded;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LegacyCompanyData {
	@Field(name = "registered_from")
	private String registeredFrom;
	@Field(name = "flag")
	private int flag;
	@Field(name = "ats_flag")
	private int atsFlag;
	@Field(name = "free")
	private int free;
	@Field(name = "is_freetrial")
	private Boolean isFreetrial;
	@Field(name = "is_dummy")
	private Boolean isDummy;
}