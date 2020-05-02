# State Pattern

``` 
It allows an object to alter its behaviour when its internal state changes.
```

- Let's take an example of a gumball machine. We can perform 4 operations on it inserting a quarter, ejecting a quarter, rotating the crank, dispensing the gumball.

- Now each of these operations can lead to different state of the machine eg NoQuarterState, HasQuarterState, SoldState(This is when you have rotated the crank and you just need to dispense the ball), SoldOutState(When the machine does not contain any gumballs.)

- One thing can be that we can add respective methods in Gumball class and every method can have an if-else block on the current state of the system and handle the action accordingly.

- But this violates the Open Closed principle as we have to change the class again and again entire and there can be good chances of bugs.

- The State Pattern gives us a way to solve this. In this we define a separate class for every state and implement all the same methods that were supposed to be done on the original machine.

- Now the original machine's role is to navigate between states. Every state will handle How that state wants to handle that particular method and every state also has the capability to
move the system to the next state.

- Strategy pattern is considered to be a sibling of this method. 

[https://www.youtube.com/watch?v=N12L5D78MAA](https://www.youtube.com/watch?v=N12L5D78MAA)

[https://refactoring.guru/design-patterns/state](https://refactoring.guru/design-patterns/state)