package org.jobseeker.logs.embedded;

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
public class IncomingData {
    // required
    @Field(name = "type")
    private String type;

    @Field(name = "object_id")
    private String objectId;

    // use in:
    // 1. Password when create fresh new user depend on employee
    @Field(name = "random_string")
    private String randomString;

    // use in:
    // 1. Job requisition
    @Field(name = "receiver_name")
    private String receiverName;

    @Field(name = "receiver_email")
    private String receiverEmail;

    // link to button redirect, use in:
    // 1. Forgot Password
    @Field(name = "redirect_url")
    private String redirectUrl;
}