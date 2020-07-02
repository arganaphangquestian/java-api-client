package dev.arganaphangquestian.reponse;

import com.squareup.moshi.Json;
import lombok.Data;

public @Data
class TodoResponse {
    @Json(name = "success")
    private boolean success = false;
}
