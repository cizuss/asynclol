package com.cizuss.asynclol.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.twitter.util.Future;

import java.util.List;

public interface EntityDeserializer {
    Gson gson = new Gson();

    default<T> T deserialize(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    default<T> Future<T> deserializeFromFuture(Future<String> json, Class<T> clazz) {
        return json.map(j -> deserialize(j, clazz));
    }

    default<T> Future<List<T>> deserializeFromFutureToList(Future<String> json) {
        return json.map(j -> gson.fromJson(j, new TypeToken<List<T>>(){}.getType()));
    }
}
