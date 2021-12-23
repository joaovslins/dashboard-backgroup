package com.dashboard.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorObjectDTO {
	
    public ErrorObjectDTO(String defaultMessage, String field2, Object rejectedValue) {
		// TODO Auto-generated constructor stub
	}
	private final String message = "";
    private final String field = "";
    private final Object parameter = new Object();

}
