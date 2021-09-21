package com.mrnadimi.ghasedaksmsapi;


/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 07 August 2021
 * <p>
 * Description: ...
 */
class MainClass {

    /*private static GhasedakSMSService ghasedakApi;

    public static void main(String[] args){
        ghasedakApi = new GhasedakSMSService("");
        //sendSMS();
        //sendBulk();
        //sendBulkPair();
        sendOtp();
        //sendTextToVoiceMessage();
        //getMessageStatus();
        //createContactGroup();
        //addContact();
        //getGroupList();
    }


    public static void sendSMS(){
        String phone = "PHONE_NUMBER";
        String message = "Hi, my name is mohamad";
        Message m = new Message(phone , message);
        ghasedakApi.send(m, new RestCallback<BaseResult>() {
            @Override
            public void onSuccess(Call<BaseResult> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });

    }


    public static void sendBulk(){

        BulkMessage bulkMessage = new BulkMessage();
        bulkMessage.addMessage("Message" , "Phone" , "lineNumber");
        ghasedakApi.sendBulk(bulkMessage, new RestCallback<BaseResult>() {
            @Override
            public void onSuccess(Call<BaseResult> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });
    }


    public static void sendBulkPair(){
        String message = "...";
        BulkMessagePair bulkMessage = new BulkMessagePair(message);
        bulkMessage.addPhone("..." );
        bulkMessage.addPhone("..." );
        ghasedakApi.sendBulkPair(bulkMessage, new RestCallback<BaseResult>() {
            @Override
            public void onSuccess(Call<BaseResult> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });
    }


    public static void sendOtp(){
        String phone = "...";
        String param = "234561";
        OtpMessage.Type type = OtpMessage.Type.TEXT;
        String template = "";
        OtpMessage otpMessage = new OtpMessage(phone , param , type , template);
        ghasedakApi.sendOtp(otpMessage, new RestCallback<OtpResponse>() {
            @Override
            public void onSuccess(Call<OtpResponse> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });
    }


    public static void sendTextToVoiceMessage(){
        String phone = "";
        String textToVoiceMessageString = "";
        TextToVoiceMessage textToVoiceMessage = new TextToVoiceMessage(phone , textToVoiceMessageString);
        ghasedakApi.sendTextToVoiceMessage(textToVoiceMessage, new RestCallback<BaseResult>() {
            @Override
            public void onSuccess(Call<BaseResult> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });
    }


    public static void getMessageStatus(){
        String messageId = "4";
        MessageStatus.Type type = MessageStatus.Type.MESSAGE_ID;
        MessageStatus messageStatus = new MessageStatus(messageId , type);
        ghasedakApi.messageStatus(messageStatus, new RestCallback<BaseResult>() {
            @Override
            public void onSuccess(Call<BaseResult> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });
    }


    public static void createContactGroup(){
        String groupName = "My Group Name";
        ghasedakApi.createGroup(new ContactGroup(groupName), new RestCallback<>() {
            @Override
            public void onSuccess(Call<CreateGroupResult> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });
    }


    public static void addContact(){
        AddContact addContact = new AddContact("" , "");
        ghasedakApi.addContact(addContact, new RestCallback<BaseResult>() {
            @Override
            public void onSuccess(Call<BaseResult> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });
    }


    public static void getGroupList(){
        ghasedakApi.getGroupsList( null, new RestCallback<GroupListResult>() {
            @Override
            public void onSuccess(Call<GroupListResult> response) {
                System.out.println("StatusCode: "+response.statusCode+"    \nResponse: "+response.response);
            }

            @Override
            public void onError(Exception ex) {
                ex.printStackTrace();
            }
        });
    }*/

}
