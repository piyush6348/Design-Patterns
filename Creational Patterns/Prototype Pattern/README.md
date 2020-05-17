# Prototype Pattern

- Sometimes object creation can be expensive process. I'm not saying creation exactly but 
loading data in the object can be expensive for eg let's say we have some employees class
that fetches data from 3-4 sources and stores the employee list. 

- Sometimes we can think of having singleton objects but in some cases it might not be suitable.

- In such cases we can use Prototype pattern. It involves cloning an object.

- The responsibility of cloning is owned by the object itself.

- This helps in cases when we want to clone private fields or do deep/shallow copy as per our design.

### Links for Better Understanding

[https://refactoring.guru/design-patterns/prototype](https://refactoring.guru/design-patterns/prototype)

[https://www.journaldev.com/1440/prototype-design-pattern-in-java](https://www.journaldev.com/1440/prototype-design-pattern-in-java)