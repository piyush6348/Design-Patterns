# Remote Proxy Pattern

- In Remote Proxy let's think of a situation where we want to access an object ie on a remote JVM. (We'll be using Java's RMI feature for this). We'll also see How proxy is related to RMI?

- For RMI we generally have 4 people involved
    1. Client Object
    2. Stub Object(Client Helper)
    3. Skeleton Object(Remote Helper)
    4. Service Object(The object whose methods we want to access remotely)
    
- Client helper is the one with which Client object will always communicate. Client will give the method to be invoked along with parameters to the Client Helper.

- Client helper will serialize this info and send it to Service Helper which will deserialize it and send invoke that method along with parameters on the actual service object.

- Now the result from this service object will again follow process of serialization and deserialization and will return to the client object.

- In this case Client Helper acts as a Proxy to remote service. Client object thinks that its calling remote service which is not the case actually.

- For Service object the call appears to be a local call as it's down by service helper. 

- When we use Java RMI the stub and skeleton objects are created at runtime by Java.

### Links for Better Understanding

The best explanation I found for this principle was in [Head First Design patterns](http://shop.oreilly.com/product/9780596007126.do)