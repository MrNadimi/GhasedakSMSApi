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
