package com.wahanda.marketplace.data.api.converter;

import com.google.gson.TypeAdapter;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import timber.log.Timber;

/**
 * Same as {@link retrofit2.GsonResponseBodyConverter} but strips characters before each json
 * response as specified in https://wahanda.atlassian.net/browse/DEV-35697
 */
final public class SafeGsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    private static final String PREFIX = ")]}', ";

    private final TypeAdapter<T> adapter;

    public SafeGsonResponseBodyConverter(TypeAdapter<T> adapter) {
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String string = value.string();
        if (string.substring(0, PREFIX.length()).equals(PREFIX)) {
            string = string.substring(PREFIX.length(), string.length());
        }
        try {
            return adapter.fromJson(string);
        } catch (NullPointerException npe) {
            Timber.e(npe);
            throw npe;
        }
    }
}
