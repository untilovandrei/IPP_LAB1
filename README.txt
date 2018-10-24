*** Abstract factory ***

The abstract class AbstractFactory.java defines the prototypes factory methods,which return objects of base classes:
1. Device.java
2. Vehicle.java

Device.java is extended by 2 classes : Laptop.java and PC.java ;
Vehicle.java is extended by 2 classes : Motocycle.java and Car.java ;

AbstractFactory.java is extended and implamented by : DeviceFactory.java and VehicleFactory.java.
FactoryProducer produces any of factories specified above depending on input parameter of "getFactory" method.
Using DeviceFactory.java can be created objects of Laptop.java and PC.java classes.
Using VehicleFactory.java can be created objects of Car.java and Motocycle.java classes.