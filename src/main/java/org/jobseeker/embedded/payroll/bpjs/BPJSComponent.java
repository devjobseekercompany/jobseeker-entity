package org.jobseeker.embedded.payroll.bpjs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BPJSComponent {

	@Field(name = "jht")
	private BPJSItemComponent jht;

	@Field(name = "jkk")
	private BPJSItemComponent jkk;

	@Field(name = "jkm")
	private BPJSItemComponent jkm;

	@Field(name = "jp")
	private BPJSItemComponent jp;

	@Field(name = "jks")
	private BPJSItemComponent jks;

}