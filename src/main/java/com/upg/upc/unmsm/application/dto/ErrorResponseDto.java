package com.upg.upc.unmsm.application.dto;

import java.util.List;

public class ErrorResponseDto {
    private int httpStatus;
    private List<ErrorDto> errors;
    
    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public List<ErrorDto> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDto> errors) {
        this.errors = errors;
    }
}
