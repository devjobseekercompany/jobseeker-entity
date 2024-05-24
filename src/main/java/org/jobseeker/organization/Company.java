package org.jobseeker.organization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.area.CityDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.master.IndustryTypeDataEmbed;
import org.jobseeker.embedded.master.NotifTokenDataEmbed;
import org.jobseeker.embedded.master.PhoneDataEmbed;
import org.jobseeker.embedded.master.SosmedDataEmbed;
import org.jobseeker.embedded.mediafile.MediaDataEmbed;
import org.jobseeker.enums.general.StatusData;
import org.jobseeker.embedded.organization.CreditDataEmbed;
import org.jobseeker.embedded.organization.GalleryDataEmbed;
import org.jobseeker.embedded.organization.LegacyCompanyData;
import org.jobseeker.embedded.organization.SiteUrlDataEmbed;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "companies")
@EqualsAndHashCode(callSuper = true)
public class Company extends GeneralTimestamp {

	@Id
	@JsonProperty("oid")
	private String _id;
	@Field(name = "_sql_id")
	private int sqlId;

	@Field(name = "name")
	private String name;
	@Field(name = "code")
	private String code;
	@Field(name = "email")
	private String email;

	@Field(name = "alias")
	private String alias;
	@Field(name = "phone_number")
	private PhoneDataEmbed phoneNumber;

	@Field(name = "npp_number")
	private String nppNumber;
	@Field(name = "npwp_number")
	private String npwpNumber;
	@Field(name = "greeting_msg")
	private String greetingMsg;

	@Field(name = "profile")
	private String profile;
	@Field(name = "address")
	private String address;
	@Field(name = "logo")
	private MediaDataEmbed logo;
	@Field(name = "video")
	private MediaDataEmbed video;
	@Field(name = "credit")
	private CreditDataEmbed credit;
	@Field(name = "industry_type")
	private IndustryTypeDataEmbed industryType = new IndustryTypeDataEmbed();

	@Field(name = "career_site_url")
	private List<SiteUrlDataEmbed> careerSiteUrl;
	@Field(name = "hrms_site_url")
	private List<SiteUrlDataEmbed> hrmsSiteUrl;
	@Field(name = "website_url")
	private String websiteUrl;

	@Field(name = "province")
	private GeneralDataEmbed province;
	@Field(name = "city")
	private CityDataEmbed city;
	@Field(name = "district")
	private GeneralDataEmbed district;
	@Field(name = "sub_district")
	private GeneralDataEmbed subDistrict;
	@Field(name = "coordinate")
	private GeoJsonPoint coordinate;

	@Field(name = "language")
	private String language;
	@Field(name = "notif_tokens")
	private List<NotifTokenDataEmbed> notifTokens;
	@Field(name = "sosmed")
	private List<SosmedDataEmbed> sosmed;
	@Field(name = "gallery")
	private List<GalleryDataEmbed> gallery;
	@Field(name = "newsletter_subscribe")
	private boolean newsletterSubscribe = true;

	@Field(name = "following")
	private int following = 0;
	@Field(name = "total_followers")
	private int totalFollowers = 0;
	@Field(name = "total_bookmark")
	private int totalBookmark = 0;
	@Field(name = "total_like")
	private int totalLike = 0;

	@Field(name = "registered_from")
	private String registeredFrom;
	@Field(name = "latest_online")
	private LocalDateTime latestOnline;
	@Field(name = "login_date")
	private LocalDateTime loginDate;
	@Field(name = "legacy_data")
	private LegacyCompanyData legacyData;
	@Field(name = "status")
	private StatusData status;
}
