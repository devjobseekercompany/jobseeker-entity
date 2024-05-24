package org.jobseeker.embedded.master;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDataEmbed {

    @Field(name = "country_code")
    private String countryCode;

    @Field(name = "phone")
    private String phone;

    @Field(name = "mobile_phone")
    private String mobilePhone;

    @Field(name = "whatsapp")
    private String whatsapp;

}