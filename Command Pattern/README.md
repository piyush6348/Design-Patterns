# Command Pattern

```
    It turns a request into a standalone object that contains all information about the request. 
```

- Let's say we have implemented some app for macOS. There is a button to copy the contents 
of let's say text on the screen. 

- Later on we decide to add a menu item as well for the same. 

- Later on we decided to add a shortcut like ctrl + c as well for the same.

- If the code is saved in let's say in each of separate UI's n all then code will be duplicated

- What command pattern suggests in this case is that we store these operations as objects
and what we'll need is to just delegate to this command object whenever we want. Let's say on above 3 actions.

- The example we are discussing in code is for a Remote which has 7 switches kinda thing. 
Every switch has further 2 buttons that does the actual work. One button is for On and second one is for Off.
We can assign one appliance to every switch and then turn it on and off accordingly.
 
### Links for Better Understanding

[https://www.youtube.com/watch?v=9qA5kw8dcSU](https://www.youtube.com/watch?v=9qA5kw8dcSU)

[https://refactoring.guru/design-patterns/command](https://refactoring.guru/design-patterns/command)