package org.jobseeker.enums.general;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageResponse {
	MSG_SUCCESS_GET_DATA("Successfully get data"),
	MSG_SUCCESS_SAVE_DATA("Successfully saved"),
	MSG_SUCCESS_SEND_DATA("Successfully send data"),
	MSG_SUCCESS_UPDATE_DATA("Successfully updated"),
	MSG_SUCCESS_DELETE_DATA("Successfully deleted"),
	MSG_FAIL_DELETE_DATA("Failed to delete"),
	MSG_SUCCESS_RESTORE_DATA("Successfully restored");

	private final String message;
}