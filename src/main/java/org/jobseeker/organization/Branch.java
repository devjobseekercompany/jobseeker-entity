package org.jobseeker.organization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jobseeker.embedded.area.CityDataEmbed;
import org.jobseeker.embedded.employee.EmployeeDataEmbed;
import org.jobseeker.embedded.general.GeneralDataEmbed;
import org.jobseeker.embedded.general.GeneralTimestamp;
import org.jobseeker.embedded.organization.CompanyDataEmbed;
import org.jobseeker.enums.StatusData;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "branches")
@EqualsAndHashCode(callSuper = true)
public class Branch extends GeneralTimestamp {
	@Id
	@JsonProperty("oid")
	private String _id;
	@Field(name = "name")
	private String name;
	@Field(name = "name")
	private String address;

	@Field(name = "city")
	private CityDataEmbed city;
	@Field(name = "district")
	private GeneralDataEmbed district;
	@Field(name = "sub_district")
	private GeneralDataEmbed subDistrict;
	@Field(name = "coordinate")
	private GeoJsonPoint coordinate;

	@Field(name = "range")
	private int range;
	@Field(name = "status")
	private StatusData status;

	@Field(name = "company")
	private CompanyDataEmbed company;
	@Field(name = "pic")
	private EmployeeDataEmbed pic;

	@Field(name = "total_employee")
	private int totalEmployee;
	@Field(name = "total_vacancy")
	private int totalVacancy;
}
