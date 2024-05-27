package org.jobseeker.candidate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.area.CityDataEmbed;
import org.jobseeker.embedded.candidate.CandidateLegacyDataEmbed;
import org.jobseeker.embedded.candidate.CandidateScoreDataEmbed;
import org.jobseeker.embedded.master.SkillDataEmbed;
import org.jobseeker.embedded.general.*;
import org.jobseeker.embedded.master.*;
import org.jobseeker.embedded.mediafile.FileDataEmbed;
import org.jobseeker.embedded.candidate.VideoResumeDataEmbed;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.jobseeker.embedded.vacancy.JobFunctionDataEmbed;
import org.jobseeker.enums.general.SourceRegistered;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "companies")
@EqualsAndHashCode(callSuper = true)
public class Candidate extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;
	@Field(name = "_sql_id")
	private Integer sqlId;

	@Field(name = "email")
	private String email;
	@Field(name = "name")
	private String name;
	@Field(name = "nickname")
	private String nickname;

	@Field(name = "cv")
	@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
	@JsonSubTypes({
			@JsonSubTypes.Type(name = "String", value = String.class),
			@JsonSubTypes.Type(name = "Object", value = FileDataEmbed.class)
	})
	private Object cv;
	@Field(name = "photo_profile")
	private PhotoProfileDataEmbed photoProfile;
	@Field(name = "video_resume")
	private VideoResumeDataEmbed videoResume;

	@Field(name = "profile")
	private String profile;
	@Field(name = "phone_number")
	private PhoneDataEmbed phoneNumber;
	@Field(name = "dob")
	private Instant dob;
	@Field(name = "pob")
	private GeneralDataEmbed pob;
	@Field(name = "gender")
	private GenderDataEmbed gender;
	@Field(name = "nationality")
	private GeneralDataEmbed nationality;
	@Field(name = "identity_type")
	private IdentityTypeDataEmbed identityType;
	@Field(name = "religion")
	private GeneralMultiLangDataEmbed religion;
	@Field(name = "marital_status")
	private GeneralMultiLangDataEmbed maritalStatus;
	@Field(name = "social_media")
	private List<SosmedDataEmbed> socialMedia;
	@Field(name = "languages")
	private String languages;

	@Field(name = "address")
	private String address;
	@Field(name = "postal_code")
	private String postalCode;
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

	@Field(name = "job_function")
	private List<JobFunctionDataEmbed> jobFunction;

	@Field(name = "position")
	private String position;
	@Field(name = "fresh_graduate")
	private Boolean freshGraduate;
	@Field(name = "expected_salary")
	private String expectedSalary;

	@Field(name = "educations")
	private List<EducationDataEmbed> educations;
	@Field(name = "last_education")
	private EducationDataEmbed lastEducation;
	@Field(name = "is_fresh_graduate")
	private Boolean isFreshGraduate;
	@Field(name = "experiences")
	private List<ExperienceDataEmbed> experiences;
	@Field(name = "total_experience")
	private Integer totalExperience;

	@Field(name = "skills")
	private List<SkillDataEmbed> skills;
	@Field(name = "certificates")
	private List<CertificateDataEmbed> certificates;
	@Field(name = "portfolios")
	private List<PortfolioDataEmbed> portfolios;

	@Field(name = "last_position")
	private GeneralDataEmbed lastPosition;
	@Getter(AccessLevel.NONE)
	@Field(name = "registered_from")
	private SourceRegistered registeredFrom;
	@Field(name = "from_employer")
	private List<CompanyDataEmbed> fromEmployer;
	@Field(name = "count")
	private Integer count;

	@Field(name = "lastest_online")
	private LocalDateTime lastestOnline;
	@Field(name = "score")
	private Integer score;
	@Field(name = "detail_scores")
	private List<CandidateScoreDataEmbed> detailScores;

	@Field(name = "total_liked")
	private Integer totalLiked;
	@Getter(AccessLevel.NONE)
	@Field(name = "total_viewed")
	private Integer totalViewed;
	@Field(name = "total_like")
	private Integer totalLike;
	@Field(name = "total_bookmarking")
	private Integer totalBookmarking;
	@Field(name = "total_following")
	private Integer totalFollowing;

	@Field(name = "notif_tokens")
	private List<NotifTokenDataEmbed> notifTokens;
	@Field(name = "legacy_data")
	private CandidateLegacyDataEmbed legacyData;

	@Field(name = "pagination_token")
	private String paginationToken;
	@Field(name = "is_showing")
	private String isShowing;


//	Unknown
//	@Field(name = "candidate_source")
//	private GeneralDataEmbed candidate_source = new GeneralDataEmbed();
}
