package com.upg.upc.unmsm.application.dto;

public class ErrorDto {
    private String detail;
    
    public ErrorDto(String detail) {
        this.detail = detail;
    }
    
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
