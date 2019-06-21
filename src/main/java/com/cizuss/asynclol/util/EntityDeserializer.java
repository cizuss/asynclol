package com.cizuss.asynclol.util;

import com.google.gson.Gson;
import com.twitter.util.Future;

public interface EntityDeserializer {
    Gson gson = new Gson();

    default<T> T deserialize(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    default<T> Future<T> deserializeFromFuture(Future<String> json, Class<T> clazz) {
        return json.map(j -> deserialize(j, clazz));
    }
}
