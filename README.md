# Design Pattern Notes

## Types of design pattern:
* Creational - Concerned with creation of Java objects. Eg: Singleton, Builder, Factory etc.
* Structural - Structuring of objects like objects inside another object. Eg: Adapter, Composite, Facade etc.
* Behavioral - Concerned about ways of communication between objects. Eg: Observer, State, Iterator etc.

### Examples and Notes on different Design Patterns
* **Singleton Design Pattern:**
   * As the name says, it allows us to create only a single object of the specified class
   * Steps to be followed to create a Singleton class:
      * Create a private default constructor of that class.
      * Create a static private instance of the class within the same class.
      * Next, create a static private method which will return this static instance created.
   * Now if we follow the above three steps and try to access the class instance using ClassName.staticInstanceName, we 
      will always be referring to same static instance no matter how many object references we create.  
