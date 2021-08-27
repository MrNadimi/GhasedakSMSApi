#### The [Ghasedak SMS API](https://ghasedak.me/) 

#### Implemention

Include lines inside  **build.gradle**:


```` 
repositories {
      ...
      maven { url "https://www.jitpack.io" }
}
````
<br/>

```` 
dependencies {
      ...
      
}
````

#### Initialize:

````Java
GhasedakSMSService ghasedakApi = new GhasedakSMSService("YOUR_API_KEY");

````

#### Send SMS:
````Java
Message m = new Message("PHONE" , "MESSAGE");
ghasedakApi.send(m , callback);

````

#### Send Bulk SMS:

````Java
BulkMessage bulkMessage = new BulkMessage();
bulkMessage.addMessage("Message" , "Phone" , "lineNumber");
ghasedakApi.sendBulk(bulkMessage , callback);
````

#### Send Bulk Pair:

````Java
String message = "...";
BulkMessagePair bulkMessage = new BulkMessagePair(message);
bulkMessage.addPhone("..." );
bulkMessage.addPhone("..." );
ghasedakApi.sendBulkPair(bulkMessage,callback);
````



#### Send OTP:

````Java
String phone = "...";
String param = "...";
OtpMessage.Type type = OtpMessage.Type.TEXT;
String template = "...";
OtpMessage otpMessage = new OtpMessage(phone , param , type , template);
ghasedakApi.sendOtp(otpMessage,callback);
````


#### Send OTP:

````Java
String phone = "";
String textToVoiceMessageString = "";
TextToVoiceMessage textToVoiceMessage = new TextToVoiceMessage(phone , textToVoiceMessageString);
ghasedakApi.sendTextToVoiceMessage(textToVoiceMessage,callback);
````

#### Message Status:

````Java
String messageId = "...";
MessageStatus.Type type = MessageStatus.Type.MESSAGE_ID;
MessageStatus messageStatus = new MessageStatus(messageId , type);
ghasedakApi.messageStatus(messageStatus,callback);
````

#### Create Contact Group:

````Java
String groupName = "My Group Name";
ghasedakApi.createGroup(new ContactGroup(groupName),callback);
````

#### Add Contact:

````Java
AddContact addContact = new AddContact("GROUP_ID" , "PHONE");
ghasedakApi.addContact(addContact,
````




