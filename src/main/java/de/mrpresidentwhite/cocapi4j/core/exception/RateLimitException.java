package de.mrpresidentwhite.cocapi4j.core.exception;

public class RateLimitException extends CoCAPI4JException {
    public RateLimitException() {
        super("429");
    }
}
