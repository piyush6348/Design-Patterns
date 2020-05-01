# Hollywood Principle

``` 
Don't call us, we'll call you.
```

- This principle aims to remove dependency rot.

- Dependency rot means high level component depending upon low level component that depends upon higher level component
that depends upon sideways components that further depends upon lower level component and so on.

- This actually makes the design of the system complicated and is difficult to maintain.

- By following this principle low level components are hooked into the system but higher level components determine
When are they required? When are they called?

- This in turn gives lower level components a feeling that you guys shouldn't call the high level components they'll call you.

- Template pattern is one of the few patterns that follow this principle. 

- How? The actual algorithm lies in the parent class. The parent class calls different methods as and when they want
and they call the implemented methods from subclass only when they want.


### Links for Better Understanding

- The best explanation I found for this principle was in [Head First Design patterns](http://shop.oreilly.com/product/9780596007126.do)

[http://matthewtmead.com/blog/hollywood-principle-dont-call-us-well-call-you-4/](http://matthewtmead.com/blog/hollywood-principle-dont-call-us-well-call-you-4/)