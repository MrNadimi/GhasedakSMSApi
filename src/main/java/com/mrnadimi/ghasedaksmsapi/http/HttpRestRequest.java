package com.mrnadimi.ghasedaksmsapi.http;

import com.google.gson.Gson;
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
public abstract class HttpRestRequest {

    protected final String url;

    public HttpRestRequest(@NotNull String url){
        this.url = url;

    }

    public abstract HttpRestRequest addParam(@NotNull String key , String value);

    public abstract HttpRestRequest addHeader(@NotNull String key , String value);

    public abstract Call<String> send() throws IOException;

    /**
     *
     * @param clazz : The response class
     * @param <T> : The response object
     * @return : response object
     * @throws IOException :
     */
    public <T> Call<T> send(Class<T> clazz) throws IOException {
        Call<String> res = send();
        if (res == null)return null;
        Gson gson = new Gson();
        System.out.println(res.response);
        return new Call<T>(res.statusCode , (T)gson.fromJson(res.response , clazz));
    }

    public <T> void sendAsync(Class<T> clazz , RestCallback<T> callback){
        execute(new Runnable() {
            @Override
            public void run() {
                try{
                    callback.onSuccess(send(clazz));
                }catch (Exception ex){
                    callback.onError(ex);
                }
            }
        });
    }

    public String getUrl() {
        return url;
    }

    private void execute(Runnable runnable){
        Thread t = new Thread(runnable);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }
}
