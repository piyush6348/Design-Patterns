# Bridge Pattern


### Definition

It allows us to separate the abstraction from the implementation. It is a structural design pattern.


### Example


#### Code

**RemoteControl** - An abstract class that defines the basic methods every remote should have.

**RemoteSimple, RemoteSmart** - These are 2 concrete implementations of the above abstract class. Both the remotes define some behaviour on the respective button clicks. 

**ITelevision** - interface which defines some behaviours every televison must have.

**SamsungSmartTelevision, SonyTelevision, XiaomiTelevision** - These are concrete implementation of this interface.

We can see that implementation of some methods in these respective classes is different.

#### Explanation

We can have an analogy of this pattern to cartesian product of sets for better understanding. 
```Let's say A = { 1, 2 } and B = { 3, 4 }```

so the ordered combinations are { {1,3}, {1,4}, {2,3}, {2,4} }.

Now let's say  we have a remote company that has to produce remotes for TV's for all companys and all models. 

This problem could have been solved by having a common Remote interface and a bunch of classes implementing the interface something like
SonyTelevisionSimpleRemote, SonyTelevisionSmartRemote, XiaomiTelevisionSimpleRemote, XiaomiTelevisionSmartRemote etc. 

But this would have resulted into large number of classes. Also it would have meant that a change in Sony TV's implementation would have led to changes in all classes of TV-Remote combination that involved SonyTV. Hence it was important to decouple the two TV's and Remote. 

### Links for Better Understanding
[Detailed Explanation on bridge pattern](https://www.youtube.com/watch?v=F1YQ7YRjttI)

[Brief Summary](https://www.youtube.com/watch?v=9jIgSsIfh_8)

