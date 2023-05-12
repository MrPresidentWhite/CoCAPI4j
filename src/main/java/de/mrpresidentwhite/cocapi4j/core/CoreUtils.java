package de.mrpresidentwhite.cocapi4j.core;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.mrpresidentwhite.cocapi4j.core.exception.*;
import okhttp3.Response;

import java.io.IOException;

public class CoreUtils {

    public static final String API_BASE_URL = "https://api.clashofclans.com/";
    public static final String API_VERSION = "v1";
    private static final ObjectMapper json = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public static Response checkResponse(Response response) throws CoCAPI4JException {
        if (response.isSuccessful()) return response;

        switch (response.code()) {
            case 400 -> {
                throw new BadRequestException();
            }
            case 403 -> {
                throw new AuthException();
            }
            case 404 -> {
                throw new NotFoundException();
            }
            case 429 -> {
                throw new RateLimitException();
            }
            case 503 -> {
                throw new MaintenanceException();
            }
            default -> {
                throw new UnknownException();
            }
        }
    }

    public static <T> T deserialize(Response response, Class<T> tClass) throws IOException {
        String body = response.body() != null ? response.body().string() : "";
        return json.readValue(body, tClass);
    }

    public static String formatTag(String tag) {
        return tag.startsWith("#") ? tag.replace("#",  "%23") : "%23" + tag;
    }
}