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
   * **Double Checked Logging:**
     See what is happening is as navin said that if we are in a thread and let's assume we created 100 threads and if we
     use synchronized getInstance() method, then the 1st thread has to be over then only the 2nd thread will continue 
     it's work and so on. So there is no Multithreading. If previously it took 1 second total to complete the work in 
     thread, now it will take 100 seconds.
     So guys why not we just ask the 1st time thread to hold on all the threads working on it and as soon as 1st thread 
     is done with it's work we ask all the remaining 99 threads to work on it simultaneously, This way 1st thread takes 
     1 second and all 99 threads will take 1 second in total only. So how to do it?
     First we check if the thread is 1st thread or not so the 1st (obj == null) if statement in video. If it's not 1st 
     it will continue and return the old obj.
     Now if it's first, we will tell other threads to stop there work till 1st thread has done it's work. So we write 
     synchronized function and in it we do error checking just in case (that's why we have two (obj == null). so 1st 
     thread will create a new instance of the class, then say to all other thread my work is done do your work now 
     simultaneously!!
     
     So back to question: Why not use synchronized block just above the first null check
     *Ans:* Because if you do that it will stop all threads each and every time, as explained above and cause more time
     for task to finish and if you do it the way he did it, then only 1st thread will ask other threads to stop for it 
     to finish it's work.

     Question: Why second check is required?? I mean obj null check??
     *Ans:* Just to be extra sure, I think so
     
* **Abstract Factory Design Pattern:**
   * Creational Design pattern
   * This pattern provides an interface for creating families of related or dependent objects without specifying their 
    concrete classes.
   * It's like a super factory which creates other factories.
   * Choose this pattern when:
      * The application needs to create multiple families of objects. Say for example, in transformers we used Factory 
        design pattern to create one family of transformers based on filename. Now may be we want to create one more 
        family of transformer objects based on some other property.
      * We need to use only one subset of families of objects at a given point of time.
      * We want to hide implementation of the families of objects by decoupling the implementation of each of these 
        operations.

* **Structural Design Pattern:**
   * ***Proxy Design Pattern***
      * This design pattern simply adds an extra layer of abstraction for our actual implementation. For example, say
   while executing Delete query in database we need ADMIN access. So, we can write a proxy class where we evaluate the
   access rights of a user performing delete and based on the user role, we call the actual class which would execute the
   database query. 
      * This proxy class would always be called first (just like we do in pinc-org-service where we evaluate access 
        rights of a user for any UPSERT operation) to evaluate access rights and if the user doesn't have enough rights,
        we would throw an exception. 
