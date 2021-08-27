package com.mrnadimi.ghasedaksmsapi.http;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 12 August 2021
 * <p>
 * Description: ...
 */
public class OkHttpGet extends HttpRestRequest {

    private HttpUrl.Builder httpUrl;
    private Request.Builder req;


    public OkHttpGet(@NotNull String url) {
        super(url);
        this.req =  new Request.Builder();
        this.httpUrl = Objects.requireNonNull(HttpUrl.parse(url)).newBuilder();

    }

    @Override
    public HttpRestRequest addParam(@NotNull String key, String value) {
        this.httpUrl.addQueryParameter(key , value);
        return this;
    }

    @Override
    public HttpRestRequest addHeader(@NotNull String key, String value) {
        this.req.addHeader(key , value);
        return this;
    }

    @Override
    public Call<String> send() throws IOException {
        req = req.get().url(httpUrl.build());
        @SuppressWarnings("DuplicatedCode") OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(req.build()).execute();
        ResponseBody res = response.body();
        if (res == null){
            return null;
        }
        return new Call<>(response.code(), res.string() ) ;
    }
}
