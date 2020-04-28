# Visitor Pattern

- Let's say we have some classes that are of same base type. Now we want to add some extra functionality to them.

- Eg We have CricketBall, CricketBat, VolleyBall class. All are shoppingElements.

- New functionality is that we want to add a discount in this season. And the developer of this module don't want us to do 
many changes. All the changes should be safe.

- Here comes Visitor Pattern.

- For every new algo/change we are going to add there's going to be a new visitor.

- We call visit method on the objects and provide the visitor. Rest the object is going to handle the invocation
and the logic of algo resides with the visitor.


### Links for Better Understanding

[https://github.com/VamshiIITBHU14/DesignPatternsInSwift](https://github.com/VamshiIITBHU14/DesignPatternsInSwift)

[https://stackoverflow.com/a/51567536](https://stackoverflow.com/a/51567536)