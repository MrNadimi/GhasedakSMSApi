package com.mrnadimi.http;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 08 August 2021
 * <p>
 * Description: ...
 */
public class OkHttpPost  extends HttpRestRequest{


    private final FormBody.Builder requestBodyBuilder;
    private Request.Builder req;


    public OkHttpPost(@NotNull String url) {
        super(url);
        this.requestBodyBuilder = new FormBody.Builder();
        this.req =  new Request.Builder();
    }

    @Override
    public HttpRestRequest addParam(@NotNull String key, String value) {
        if (value == null){
            value = "";
        }
        this.requestBodyBuilder.add(key , value);
        return this;
    }

    @Override
    public HttpRestRequest addHeader(@NotNull String key, @NotNull String value) {
        this.req.addHeader(key , value);
        return this;
    }

    @Override
    public Call<String> send() throws IOException {
        req = req.post(requestBodyBuilder.build()).url(this.url);
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(req.build()).execute();
        ResponseBody res = response.body();
        if (res == null){
            return null;
        }
        return new Call<>(response.code(), res.string() ) ;
    }




}
