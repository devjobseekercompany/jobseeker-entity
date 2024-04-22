package com.jobseeker.entity.logs;

import com.jobseeker.entity.embeded.ses.IncomingData;
import com.jobseeker.entity.enums.StatusSendingMail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sending_mails")
public class SendingMail {

    @Id
    private String _id;

    @Field(name = "incoming_data")
    private IncomingData incomingData;

    @Field(name = "status")
    private StatusSendingMail status;

    @Field(name = "reason")
    private String reason;
}
