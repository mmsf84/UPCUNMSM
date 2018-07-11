package com.upg.upc.unmsm.comon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.upg.upc.unmsm.application.dto.ErrorDto;
import com.upg.upc.unmsm.application.dto.ErrorResponseDto;
import com.upg.upc.unmsm.application.dto.OkDataResponseDto;
 

public class BaseController {
	
    public <T> ResponseEntity<Object> getOkDataResponse(List<T> data) {
        OkDataResponseDto<T> okDataResponseDto = new OkDataResponseDto<T>();
        okDataResponseDto.setHttpStatus(HttpStatus.OK.value());
        okDataResponseDto.setData(data);
        return new ResponseEntity<Object>(okDataResponseDto, HttpStatus.OK);
    }
    public ResponseEntity<Object> getExceptionResponse(Exception ex)
    { 	ex.printStackTrace(); //TODO log the error
        ErrorDto errorDto = new ErrorDto("Failed Request");
        List<ErrorDto> errorsDto = new ArrayList<ErrorDto>();
        errorsDto.add(errorDto);
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorResponseDto.setErrors(errorsDto);
        return new ResponseEntity<Object>(errorResponseDto, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    public ResponseEntity<Object> getApplicationErrorResponse(List<Error> errors)
    {   List<ErrorDto> errorsDto = new ArrayList<ErrorDto>();
        for (Error error : errors) {
            errorsDto.add(new ErrorDto(error.getMessage()));
        }
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setHttpStatus(HttpStatus.BAD_REQUEST.value());
        errorResponseDto.setErrors(errorsDto);
        return new ResponseEntity<Object>(errorResponseDto, HttpStatus.BAD_REQUEST);
    }	
	
	
	 
}
