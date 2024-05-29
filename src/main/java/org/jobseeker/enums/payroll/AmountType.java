package org.jobseeker.enums.payroll;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AmountType {

    PERCENTAGE("Percentage"),
    FIXED("Fixed");

    private final String label;
}
