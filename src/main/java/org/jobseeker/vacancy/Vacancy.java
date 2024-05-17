package org.jobseeker.vacancy;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.area.CityDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.vacancy.JobFunctionDataEmbed;
import org.jobseeker.embedded.vacancy.RecruitmentProcessDataEmbed;
import org.jobseeker.embedded.vacancy.requirement.*;
import org.jobseeker.enums.StatusData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "vacancies")
@EqualsAndHashCode(callSuper = true)
public class Vacancy extends GeneralTimestamp {
	@Id
	@JsonProperty("oid")
	private String _id;
	@Field(name = "_sql_id")
	private Integer sqlId;

	// RR Number used for Job Requisition
	@Field(name = "rr_number")
	private String rrNumber;

	// Vacancy Information
	@Field(name = "vacancy_name")
	private String vacancyName;
	@Field(name = "department")
	private GeneralDataEmbed department;
	@Field(name = "branch")
	private GeneralDataEmbed branch;

	// Pub/Exp Date
	@Field(name = "publish_date")
	private LocalDateTime publishDate;
	@Field(name = "expired_date")
	private LocalDateTime expiredDate;

	// Detail Vacancy Information
	@Field(name = "description")
	private String description;
	@Field(name = "other")
	private String other;
	@Field(name = "relocate")
	private Boolean relocate;
	@Field(name = "image")
	private String image;
	@Field(name = "video")
	private String video;
	@Field(name = "thumbnail")
	private String thumbnail;

	// Job Summary
	@Field(name = "job_level")
	private GeneralDataEmbed jobLevel;
	@Field(name = "job_type")
	private GeneralMultiLangDataEmbed jobType;
	@Field(name = "workplacement_type")
	private GeneralMultiLangDataEmbed workplacementType;
	@Field(name = "job_function")
	private JobFunctionDataEmbed jobFunction;

	// Salary
	@Field(name = "minimum_salary")
	private int minimumSalary;
	@Field(name = "maximum_salary")
	private int maximumSalary;
	@Field(name = "hide_range_salary")
	private Boolean hideRangeSalary;
	@Field(name = "negotiable_salary")
	private Boolean negotiableSalary;

	// Area
	@Field(name = "coordinate")
	private GeoJsonPoint coordinate;
	@Field(name = "province")
	private GeneralDataEmbed province;
	@Field(name = "city")
	private CityDataEmbed city;
	@Field(name = "district")
	private GeneralDataEmbed district;
	@Field(name = "sub_district")
	private GeneralDataEmbed subDistrict;

	// Recruitment Process
	@Field(name = "recruitment_process")
	private List<RecruitmentProcessDataEmbed> recruitmentProcess;

	// Requirement
	@Field(name = "number_of_employee_needed")
	private int numberOfEmployeeNeeded = 1;
	@Field(name = "age_requirement")
	private AgeRequirementDataEmbed ageRequirement;
	@Field(name = "gender_requirement")
	private GenderRequirementDataEmbed genderRequirement;
	@Field(name = "min_experience_requirement")
	private MinExperienceRequirementDataEmbed minExperienceRequirement;
	@Field(name = "min_education_requirement")
	private MinEducationRequirementDataEmbed minEducationRequirement;
	@Field(name = "gpa_requirement")
	private GPARequirementDataEmbed gpaRequirement;
	@Field(name = "city_requirement")
	private CityRequirementDataEmbed cityRequirement;
	@Field(name = "province_requirement")
	private ProvinceRequirementDataEmbed provinceRequirement;
	@Field(name = "max_salary_requirement")
	private Object maxSalaryRequirement;

	// All About Count
	@Field(name = "applicant_count")
	private int applicantCount = 0;
	@Field(name = "candidate_shortlisted_count")
	private int candidateShortlistedCount = 0;
	@Field(name = "offer_count")
	private int offerCount = 0;
	@Field(name = "reject_count")
	private int rejectCount = 0;
	@Field(name = "interview_count")
	private int interviewCount = 0;
	@Field(name = "hire_count")
	private int hireCount = 0;
	@Field(name = "view_count")
	private int viewCount = 0;
	@Field(name = "like_count")
	private int likeCount = 0;
	@Field(name = "bookmark_count")
	private int bookmarkCount = 0;
	@Field(name = "video_resume_count")
	private int videoResumeCount = 0;
	@Field(name = "count")
	private Integer count;

	// Word Char Count
	@Field(name = "profile_char_count")
	private Integer profileCharCount;
	@Field(name = "description_char_count")
	private Integer descriptionCharCount;

	// Eligible
	@Field(name = "is_company_profile_eligible")
	private Boolean isCompanyProfileEligible;
	@Field(name = "is_company_gallery_eligible")
	private Boolean isCompanyGalleryEligible;
	@Field(name = "is_vacancy_description_eligible")
	private Boolean isVacancyDescriptionEligible;

	// Status
	@Field(name = "flag")
	private Integer flag;
	@Field(name = "flag_input")
	private String flagInput;
	// This this status is used for flagging soft delete
	@Field(name = "status")
	private StatusData status;
}
