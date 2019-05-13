public class EverydayRegularNormalPizzeria {
    public void makePizza(DeliveryStrategy deliveryStrategy){
        System.out.println("Making pizza..");
        deliveryStrategy.execute();
        System.out.println("Get money for pizza..");
    }

}
