# Flyweight Pattern


- This pattern helps in avoiding creation of large number of objects. For ex if there is a class where 
we might need to create close to 10^5 objects then this pattern can be of good choice.

- It caches the objects. But we need to take care of intrinsic and extrinsic properties.

- There are some properties that might be unique to an object. For ex in our case it's player weapon. These are called as extrinsic properties.

- For these kinda properties we need to make sure that we set them accordingly after fetching them from the factory.

- This pattern is often accompanied with factory method/abstract factory method because a caching logic kinda logic is there. 

### Links for Better Understanding

[https://www.geeksforgeeks.org/flyweight-design-pattern/](https://www.geeksforgeeks.org/flyweight-design-pattern/)
