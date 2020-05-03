# Virtual Proxy Pattern

- It acts as a representative of an object that might be expensive to create. 

- It defers the creation of object until it is needed.

- The virtual proxy also acts as a surrogate for the object before and while it's being created.

- Let's say we have an Image loading class which loads an image from an url. Now this loading can take some time and will be done on a different thread inside.
So a way of doing this to have an ImageProxy object which is what is available to everyone. It shows some loading image by default. And takes the responsibility to create the object
of Image loading class and fetching it on a different thread. It also updates the view after fetching the required image.  

### Links for Better Understanding

The best explanation I found for this principle was in [Head First Design patterns](http://shop.oreilly.com/product/9780596007126.do)