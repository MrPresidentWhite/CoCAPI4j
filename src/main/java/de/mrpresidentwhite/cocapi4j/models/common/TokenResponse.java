package de.mrpresidentwhite.cocapi4j.models.common;

public class TokenResponse {

    private String tag;
    private String token;
    private String status;

    public TokenResponse(String tag, String token, String status) {
        this.tag = tag;
        this.token = token;
        this.status = status;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
