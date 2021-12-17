package com.belajarjava.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseData<T> {
    private boolean Status;
    private List<String> message = new ArrayList<>();
    private T payload;

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

}
