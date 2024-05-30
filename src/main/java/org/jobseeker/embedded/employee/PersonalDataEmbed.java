package org.jobseeker.embedded.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.area.CityDataEmbed;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.jobseeker.embedded.master.PhoneDataEmbed;
import org.jobseeker.embedded.mediafile.FileDataEmbed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDataEmbed {

	@Field(name = "photo_profile")
	private FileDataEmbed photoProfile;

	@Field(name = "gender")
	private GeneralMultiLangDataEmbed gender;

	@Field(name = "religion")
	private GeneralMultiLangDataEmbed religion;

	@Field(name = "phone")
	private PhoneDataEmbed phone;

	@Field(name = "emergency_contact")
	private PhoneDataEmbed emergencyContact;

	@Field(name = "city_of_birth")
	private CityDataEmbed cityOfBirth;

	@Field(name = "birthdate")
	private Instant birthDate;

	@Field(name = "marital_status")
	private GeneralMultiLangDataEmbed maritalStatus;

	@Field(name = "number_of_children")
	private int numberOfChildren;

	@Field(name = "link_national_id")
	private String linkNationalId;

	@Field(name = "national_id_number")
	private String nationalIdNumber;

	@Field(name = "postal_code")
	private String postalCode;

	@Field(name = "nation_id_address")
	private String nationIdAddress;

	@Field(name = "residental_address")
	private String residentalAddress;

}
