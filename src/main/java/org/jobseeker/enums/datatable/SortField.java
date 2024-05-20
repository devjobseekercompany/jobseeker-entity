package org.jobseeker.enums.datatable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SortField {
    id("_id"),
    name("name"),
    createdAt("created_at");

    private final String databaseFieldName;
}