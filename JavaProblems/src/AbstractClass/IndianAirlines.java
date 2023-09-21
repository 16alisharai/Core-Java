package AbstractClass;

public class IndianAirlines extends AirCraftGuidelines {
    public static void main(String Args[]){

        AirCraftGuidelines guidelines = new IndianAirlines();  //similar to Wedriver driver = new Chromedriver();
        guidelines.safetyRules();
        guidelines.bodyColor();


    }

    @Override
    public void bodyColor() {

        System.out.println("Grey");

    }
}
