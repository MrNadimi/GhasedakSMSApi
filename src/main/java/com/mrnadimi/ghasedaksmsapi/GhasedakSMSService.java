package com.mrnadimi.ghasedaksmsapi;

import com.mrnadimi.ghasedaksmsapi.http.OkHttpGet;
import com.mrnadimi.ghasedaksmsapi.http.RestCallback;
import com.mrnadimi.ghasedaksmsapi.http.HttpRestRequest;
import com.mrnadimi.ghasedaksmsapi.http.OkHttpPost;
import com.mrnadimi.ghasedaksmsapi.model.CreateGroupResult;
import com.mrnadimi.ghasedaksmsapi.model.BaseResult;
import com.mrnadimi.ghasedaksmsapi.model.GroupListResult;
import com.mrnadimi.ghasedaksmsapi.model.OtpResponse;
import com.mrnadimi.ghasedaksmsapi.model.req.*;
import lombok.NonNull;



/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 07 August 2021
 * <p>
 * Description: ...
 */
public class GhasedakSMSService {

    private static final String userAgent = System.getProperty("http.agent");
    private static final String BASE_URL = "https://api.ghasedak.me/v2/";

    private final String apiKey;



    public GhasedakSMSService(String apiKey) {
        this.apiKey = apiKey;
    }


    @SuppressWarnings("SameParameterValue")
    private HttpRestRequest getPOSTRequest(String url){
        return new OkHttpPost(url).addHeader("apikey" , apiKey).addHeader("content-type" , "application/x-www-form-urlencoded");
    }

    private HttpRestRequest getGETRequest(String url){
        return new OkHttpGet(url).addHeader("apikey" , apiKey).addHeader("content-type" , "application/x-www-form-urlencoded");
    }


    public void send(Message message, RestCallback<BaseResult> callback){
        HttpRestRequest request = getPOSTRequest(BASE_URL+"sms/send/simple");
        request.addParam("message" , message.getMessage())
                .addParam("receptor" , message.getPhone())
                .addParam("linenumber" , message.getLineNumber())
                .addParam("senddate" , message.getSendDate())
                .addParam("checkid" , message.getCheckId());
        request.sendAsync(BaseResult.class , callback);
    }



    public void sendBulk(@NonNull BulkMessage bulkMessage, RestCallback<BaseResult> callback){
        HttpRestRequest request = getPOSTRequest(BASE_URL+"sms/send/bulk");
        request.addParam("message" , bulkMessage.getMessages())
                .addParam("receptor" ,  bulkMessage.getReceptors())
                .addParam("linenumber" , bulkMessage.getLineNumbers())
                .addParam("senddate" , bulkMessage.getSendDates())
                .addParam("checkid" , bulkMessage.getCheckIds());
        request.sendAsync(BaseResult.class , callback);
    }

    public void sendBulkPair(@NonNull BulkMessagePair bulkMessage, RestCallback<BaseResult> callback){
        HttpRestRequest request = getPOSTRequest(BASE_URL+"sms/send/pair");
        request.addParam("message" , bulkMessage.getMessage())
                .addParam("receptor" ,  bulkMessage.getReceptors())
                .addParam("linenumber" , bulkMessage.getLineNumber())
                .addParam("senddate" , bulkMessage.getSendDate())
                .addParam("checkid" , bulkMessage.getCheckIds());
        request.sendAsync(BaseResult.class , callback);
    }

    public void sendOtp(@NonNull OtpMessage otpMessage, RestCallback<OtpResponse> callback){
        HttpRestRequest request = getPOSTRequest(BASE_URL+"verification/send/simple");
        request
                .addParam("receptor" ,  otpMessage.getReceptors())
                .addParam("type" ,  otpMessage.getType().toString())
                .addParam("template" ,  otpMessage.getTemplate())
                .addParam("checkid" , otpMessage.getCheckId());

        for (int i = 0 ; i < otpMessage.getParams().size() ; i++){
            String param =  otpMessage.getParams().get(i);
            request.addParam("param"+(i+1) , param);
        }

        request.sendAsync(OtpResponse.class , callback);
    }


    public void sendTextToVoiceMessage(@NonNull TextToVoiceMessage textToVoiceMessage, RestCallback<BaseResult> callback){
        HttpRestRequest request = getPOSTRequest(BASE_URL+"voice/send/simple");
        request
                .addParam("receptor" ,  textToVoiceMessage.getReceptors())
                .addParam("message" ,  textToVoiceMessage.getMessage())
                .addParam("senddate" ,  textToVoiceMessage.getSendDate());

        request.sendAsync(BaseResult.class , callback);
    }


    public void messageStatus(@NonNull MessageStatus messageStatus, RestCallback<BaseResult> callback){
        HttpRestRequest request = getPOSTRequest(BASE_URL+"sms/status");
        request
                .addParam("id" ,  messageStatus.getIds())
                .addParam("type" ,  messageStatus.getType().getType()+"");
        request.sendAsync(BaseResult.class , callback);
    }

    public void createGroup(@NonNull ContactGroup contactGroup, RestCallback<CreateGroupResult> callback){
        HttpRestRequest request = getPOSTRequest(BASE_URL+"contact/group/new");
        request
                .addParam("name" ,  contactGroup.getName())
                .addParam("parent" ,  contactGroup.getParentGroupId()+"");
        request.sendAsync(CreateGroupResult.class , callback);
    }

    public void addContact(@NonNull AddContact add, RestCallback<BaseResult> callback){
        HttpRestRequest request = getPOSTRequest(BASE_URL+"contact/group/addnumber");
        request
                .addParam("groupid" ,  add.getGroupId())
                .addParam("number" ,  add.getNumbers())
                .addParam("firstname" ,  add.getFirstNames())
                .addParam("lastname" ,  add.getLastNames())
                .addParam("email" ,  add.getEmails());
        request.sendAsync(BaseResult.class , callback);
    }

    /**
     *
     * @param parentGroupId: Set 0 for root
     * @param callback :
     */
    public void getGroupsList(Integer parentGroupId, RestCallback<GroupListResult> callback){
        HttpRestRequest request = getGETRequest(BASE_URL+"contact/group/list");
        request
                .addParam("parent" ,  parentGroupId == null ? null : String.valueOf(parentGroupId));
        request.sendAsync(GroupListResult.class , callback);
    }






}
