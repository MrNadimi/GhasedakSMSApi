package com.mrnadimi.ghasedaksmsapi.model;

import com.mrnadimi.ghasedaksmsapi.model.Result;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 07 August 2021
 * <p>
 * Description: ...
 */
public abstract class ResponseFather {

    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public boolean isSuccessful(){
        return result.getCode() == 200;
    }

    @Override
    public String toString() {
        return "ResponseFather{" +
                "result=" + result +
                '}';
    }
}
