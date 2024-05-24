package org.jobseeker.logs;

import lombok.experimental.SuperBuilder;
import org.jobseeker.enums.mailing.StatusSendingMail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jobseeker.logs.embedded.IncomingData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
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
