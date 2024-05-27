package org.jobseeker.embedded.candidate;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.jobseeker.embedded.master.EducationDataEmbed;
import org.jobseeker.embedded.master.PhoneDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDataEmbed {

	@Id
	@JsonProperty("oid")
	private String _id;

	@Field(name = "name")
	private String name;

	@Field(name = "email")
	private String email;

	@Field(name = "photo_profile")
	private String photoProfile;

	@Field(name = "fresh_graduate")
	private Boolean freshGraduate;

	@Field(name = "videoResume")
	private String video_resume;

	@Field(name = "cv")
	private String cv;

	@Field(name = "age")
	private Integer age = 0;

	@Field(name = "gpa")
	private Double gpa = 0D;

	@Field(name = "gender")
	private String gender;

	@Field(name = "district")
	private GeneralDataEmbed district;

	@Field(name = "city")
	private GeneralDataEmbed city;

	@Field(name = "province")
	private GeneralDataEmbed province;

	@Field(name = "last_education")
	private EducationDataEmbed lastEducation;

	@Field(name = "total_experience")
	private Integer totalExperience = 0;

	@Field(name = "position")
	private String position;

	@Field(name = "birthdate")
	private String birthdate;

	@Field(name = "phone_number")
	private PhoneDataEmbed phoneNumber;

	@Field(name = "expected_salary")
	private Long expectedSalary = 0L;

	@Field(name = "point_education")
	private Long pointEducation = 0L;

	@Field(name = "job_function")
	private GeneralMultiLangDataEmbed jobFunction;

	@Field(name = "source")
	private String source;
}