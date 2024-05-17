package org.jobseeker.organization.embedded;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditDataEmbed {
    @Field(name = "posting_credit")
    private int postingCredit;
    @Field(name = "offer_credit")
    private int offerCredit;
    @Field(name = "coin")
    private int coin;
}