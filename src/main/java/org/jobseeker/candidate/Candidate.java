package org.jobseeker.candidate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;
import org.jobseeker.embedded.candidate.CandidateLegacyData;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralMultiLangDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.general.ObjectMultiLanguage;
import org.jobseeker.embedded.master.PhoneDataEmbed;
import org.jobseeker.embedded.mediafile.FileDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
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
	@Field(name = "address")
	private String address;
//	@Field(name = "photo_profile")
//	private PhotoProfileEmbedded photo_profile = new PhotoProfileEmbedded();\
//
//	@Field(name = "cv")
//	@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
//	@JsonSubTypes({
//			@JsonSubTypes.Type(name = "String", value = String.class),
//			@JsonSubTypes.Type(name = "Object", value = FileDataEmbed.class)
//	})
//	private Object cv;
//
//	@Field(name = "profile")
//	private String profile;
//	@Field(name = "video_resume")
//	private VideoResumeEmbedded video_resume = new VideoResumeEmbedded();
//	@Field(name = "martial_status")
//	private GeneralMultiLangDataEmbed martial_status = new GeneralMultiLangDataEmbed();
//	@Field(name = "candidate_source")
//	private GenericObject candidate_source = new GenericObject();
//	@Field(name = "nationality")
//	private GeneralDataEmbed nationality = new GeneralDataEmbed();
//	@Field(name = "")
//	private IdentityType identity_type = new IdentityType();
//	@Field(name = "")
//	private String languages;
//	@Field(name = "")
//	private PhoneDataEmbed phone = new PhoneDataEmbed();
//	@Field(name = "")
//	private Instant birthdate;
//	@Field(name = "")
//	private GenderEmbedded gender = new GenderEmbedded();
//	@Field(name = "")
//	private List<GenericMultiLanguageObject> job_function = new ArrayList<>();
//	@Field(name = "")
//	private GenericMultiLanguageObject religion = new GenericMultiLanguageObject();
//	@Field(name = "")
//	private GenericObject province = new GenericObject();
//	@Field(name = "")
//	private CityEmbedded city = new CityEmbedded();
//	@Field(name = "")
//	private GenericObject district = new GenericObject();
//	@Field(name = "")
//	private GenericObject sub_district = new GenericObject();
//	@Field(name = "")
//	private String position;
//	@Field(name = "")
//	private Boolean fresh_graduate;
//	@Field(name = "")
//	private String expected_salary;
//	@Field(name = "")
//	private String current_salary;
//	@Field(name = "")
//	private List<EducationEmbedded> educations = new ArrayList<>();
//	@Field(name = "")
//	private List<ExperienceEmbedded> experiences = new ArrayList<>();
//	@Field(name = "")
//	private List<CandidateSkillEmbedded> skills = new ArrayList<>();
//	@Field(name = "")
//	private List<SocialMediaEmbedded> social_media = new ArrayList<>();
//	@Field(name = "")
//	private List<CertificateEmbedded> certificates = new ArrayList<>();
//	@Field(name = "")
//	private List<PortfolioEmbedded> portfolios = new ArrayList<>();
//	@Field(name = "")
//	private Integer total_experience;
//	@Field(name = "")
//	private EducationEmbedded last_education = new EducationEmbedded();
//	@Field(name = "")
//	private GeoJsonPoint coordinate;
//	@Field(name = "")
//	private LocalDateTime login_date;
//	@Field(name = "")
//	private LocalDateTime lastest_online;
//	@Field(name = "")
//	private Integer score;
//	@Field(name = "")
//	private List<CandidateScoreEmbedded> detail_scores = new ArrayList<>();
//	@Field(name = "")
//	private Integer total_liked;
//	@Getter(AccessLevel.NONE)
//	@Field(name = "")
//	private Integer total_viewed;
//	@Field(name = "")
//	private Integer total_like;
//	@Field(name = "")
//	private Integer total_bookmarking;
//	@Field(name = "")
//	private Integer total_following;
//	@Field(name = "")
//	private SourceRegistered registered_from;
//	@Field(name = "")
//	private CompanyEmbedded fromEmployer = new CompanyEmbedded();
//	@Field(name = "")
//	private List<NotifTokenEmbedded> notifTokens = new ArrayList<>();
//	@Field(name = "")
//	private CandidateLegacyData legacy_data = new CandidateLegacyData();
//	@Field(name = "")
//	private LocalDateTime created_at;
//	@Field(name = "")
//	private LocalDateTime updated_at;
//	@Field(name = "")
//	private Integer count;
//	@Field(name = "")
//	private String pagination_token;
//	@Field(name = "")
//	private String is_showing;
//	@Field(name = "")
//	private String bio;
}
