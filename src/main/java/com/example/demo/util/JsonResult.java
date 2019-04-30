package com.example.demo.util;

import lombok.Data;

@Data
public class JsonResult {

    private int totalPage;
    private String message;
    private long code;
    private Object data;

    public JsonResult(String message, long code) {

        this.message = message;
        this.code= code;
    }

    public JsonResult(int totalPage, String message, long code) {
        this.totalPage = totalPage;
        this.message = message;
        this.code= code;
    }

    public JsonResult(String message, long code, Object data) {
        this.message = message;
        this.code= code;
        this.data = data;
    }

    public JsonResult(int totalPage, String message, long code, Object data) {
        this.totalPage = totalPage;
        this.message = message;
        this.code= code;
        this.data = data;
    }
}
