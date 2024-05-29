package org.jobseeker.embedded.organization.bpjs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
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