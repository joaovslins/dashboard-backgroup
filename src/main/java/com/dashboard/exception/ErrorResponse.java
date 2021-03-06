package com.dashboard.exception;


import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorResponse {
	
    private final String message = "";
    private final int code = 0;
    private final String status = "";
    private final String objectName = "";
    private final List<ErrorObjectDTO> errors = null;

}
