package com.s19.spotvpc.exception;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
	
	private Date timestamp;
	private String message;
	private String details;
	private String userView;

}
