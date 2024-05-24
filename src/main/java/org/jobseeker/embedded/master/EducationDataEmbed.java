package org.jobseeker.embedded.master;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class EducationDataEmbed {

	@Field(name = "degree")
	private GeneralMultiLangDataEmbed degree;

	@Field(name = "major")
	private String major;

	@Field(name = "logo")
	private String logo;

	@Field(name = "institution")
	private String institution;

	@Field(name = "province")
	private GeneralDataEmbed province;

	@Field(name = "city")
	private GeneralDataEmbed city;

	@Field(name = "district")
	private GeneralDataEmbed district;

	@Field(name = "sub_district")
	private GeneralDataEmbed sub_district;

	@Field(name = "gpa")
	private double gpa;

	@Field(name = "certificate")
	private String certificate;

	@Field(name = "start_date")
	private Instant startDate;

	@Field(name = "graduate_date")
	private Instant graduateDate;

	@Field(name = "is_until_now")
	private boolean isUntilNow = false;

	@Field(name = "point_education")
	private int pointEducation;

}