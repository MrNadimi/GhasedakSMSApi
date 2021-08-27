package com.mrnadimi.ghasedaksmsapi.http;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 08 August 2021
 * <p>
 * Description: ...
 */
public class Call<T> {

    public final int statusCode;
    public final T response;

    public Call(int statusCode, T response) {
        this.statusCode = statusCode;
        this.response = response;
    }


    public boolean isSuccessful(){
        return statusCode >= 200 && statusCode <= 299;
    }

}
