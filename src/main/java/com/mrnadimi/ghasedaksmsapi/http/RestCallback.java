package com.mrnadimi.ghasedaksmsapi.http;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 08 August 2021
 * <p>
 * Description: ...
 */
public interface RestCallback<T> {

    public void onSuccess(Call<T> response);
    public void onError(Exception ex);

}
