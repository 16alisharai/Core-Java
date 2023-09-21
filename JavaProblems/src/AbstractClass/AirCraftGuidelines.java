package AbstractClass;

//Shows necessary details (what) , hides unnecessary details (how)
//Can have both implemented and non-implemented methods or say can have both abstract method and concrete method
//Except private we can have any access specifier
//Any method not having implementation is called as abstract method
//Partial Abstraction
//unimplemented methods (abstract) become necessary to be implemented in child class
//We cannot create object of an abstract class like -
//AirCraftGuidelines guide = new AirCraftGuidelines();
//Means we cannot instantiate abstract classes


public abstract class AirCraftGuidelines {

    public void safetyRules(){
        System.out.println("Ensure your Safety");
    }

    public abstract void bodyColor();

}
