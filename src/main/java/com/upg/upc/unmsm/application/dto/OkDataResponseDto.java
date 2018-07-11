package com.upg.upc.unmsm.application.dto;

import java.util.List;

public class OkDataResponseDto<T> {
    private int httpStatus;
    private List<T> data;
    
    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
