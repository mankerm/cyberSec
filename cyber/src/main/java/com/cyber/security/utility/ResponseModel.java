package com.cyber.security.utility;

import java.time.LocalDateTime;

public class ResponseModel {

	private LocalDateTime timestamp;

	private String message;

	private int status;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ResponseDTO [timestamp=" + timestamp + ", message=" + message + ", status=" + status + "]";
	}
}
