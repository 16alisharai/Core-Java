package Interfaces;

public class IndianTraffic implements CentralTrafficInterface, ContinentalTrafficInterface{

    public static void main(String Args[]){
        ContinentalTrafficInterface trafficRule= new IndianTraffic();
        CentralTrafficInterface trafficLight = new IndianTraffic();
        trafficLight.greenGo();
        System.out.println(a);
        trafficRule.trafficRules();

    }


    @Override
    public void greenGo (){

        System.out.println("Green");

    }

    @Override
    public void redStop(){

        System.out.println("Red");

    }

    @Override
    public void yellowGetReady(){

        System.out.println("Yellow");

    }


    @Override
    public void trafficRules() {
        System.out.println("New Rules Are Implemented");
    }
}
