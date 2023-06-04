##FLYWEIGHT DESIGN PATTERN

* This is a creational design pattern
* This design pattern is specifically used whenever we need to optimize memory usage by an object
* This can be used when data can be shared across objects.
* Consider a gaming scenario - 
Say, there are two types of robot objects `HUMANOID` and `ROBOTIC_DOG`. We need to create huge number of objects of these types.
And for both these object types, there are some heavy-weight member variables which can be shared by all the individual types, i.e., for all
the `HUMANOID` types there will be few common member variables which can be shared amongst all the `HUMANOID` type objects.