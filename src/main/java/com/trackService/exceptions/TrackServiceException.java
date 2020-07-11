package com.trackService.exceptions;

public class TrackServiceException extends RuntimeException {
    public TrackServiceException(String message, Throwable cause){
        super(message,cause);
    }
}
