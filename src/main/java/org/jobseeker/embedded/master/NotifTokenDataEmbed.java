package org.jobseeker.embedded.master;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class NotifTokenDataEmbed extends GeneralTimestamp {

	@Field(name = "_sql_id")
	private int sqlId;

	@Field(name = "device_id")
	private String deviceId;

	@Field(name = "username")
	private String username;

	@Field(name = "notif_token_mobile")
	private String notifTokenMobile;

	@Field(name = "login_from")
	private String loginFrom;

}