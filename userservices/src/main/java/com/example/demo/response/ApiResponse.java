package com.example.demo.response;

import java.security.Timestamp;

import org.springframework.http.HttpStatus;

import lombok.Builder;
@Builder
public class ApiResponse {
	private String message;
	private boolean sucess;
	private HttpStatus httpStatus;
	private Timestamp timestamp;
	private String error;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSucess() {
		return sucess;
	}
	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public ApiResponse(String message, boolean sucess, HttpStatus httpStatus, Timestamp timestamp, String error) {
		super();
		this.message = message;
		this.sucess = sucess;
		this.httpStatus = httpStatus;
		this.timestamp = timestamp;
		this.error = error;
	}
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void builder() {
		// TODO Auto-generated method stub
		
	}
	
	

}
