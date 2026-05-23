package com.bookverse.common.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {

    private boolean success;
    private T data;
    private String msg;
    private LocalDateTime timestamp;
    private String errCode;

    public ApiResponse(boolean success, T data, String msg, String errCode) {
        this.success = success;
        this.data = data;
        this.msg = msg;
        this.timestamp = java.time.LocalDateTime.now();
        this.errCode = errCode;
    }
}
