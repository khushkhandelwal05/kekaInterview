package com.khush.kekaInterview.exception;

/** The downstream service timed out, refused the connection, or returned an error. Maps to 503. */
public class DownstreamUnavailableException extends RuntimeException {
    public DownstreamUnavailableException(String message) {
        super(message);
    }

    public DownstreamUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }
}
