# Composite Pattern

``` 
It allows us to build structures of objects in form of trees that contain both composition of objects as well as individual objects as nodes.
```

- Let's say we have to create a menu for a restaurant. It will include breakfast, lunch and dinner. (Probably more in future Who knows?)

- This menu can have further classification as well eg Breakfast can have 3 more menus like South Indian Breakfast, North Indian Breakfast, English Breakfast.

- Even lunch can have like Tandoori, Grilled, Chinese and so on... 

- These sub classifications can have further new classifications and hence at the end we can end up with a tree kinda structure
that can have many levels of nesting.

- One thing to note here is that every component whether it's a leaf node or a non leaf node all implements the same interface.

- The interface contains methods for both leaf and non leaf nodes.

- When we want to create an object for a non leaf node we can override only those methods

- When we want to create an object for a leaf node we can override the methods specific to it.

- Invoking a non leaf function on leaf node will throw an exception and same for the case if we call a leaf node function on non leaf node.

- This helps us in treating every node in the same way.

- This also helps in applying one piece of operation at the entire tree very easily.

### Links for Better Understanding

[https://www.youtube.com/watch?v=EWDmWbJ4wRA](https://www.youtube.com/watch?v=EWDmWbJ4wRA)

[https://refactoring.guru/design-patterns/composite](https://refactoring.guru/design-patterns/composite)