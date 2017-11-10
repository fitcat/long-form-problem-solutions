package model;

public class Server implements Servable {
    //MODIFIES: this
    //EFFECTS: creates new order with the dish on the menu
    @Override
    public Order takeOrder(Dish dish) {
        System.out.println(getPrefix() + "Taking order...");
        Order o = new Order(dish);
        System.out.print("Order taken: ");
        o.print();
        return o;
    }

    //MODIFIES: this
    //EFFECTS: takes payment for the guest and removes order from system
    @Override
    public double takePayment(Order order) {
        System.out.println(getPrefix() + "Taking payment...");
        System.out.println("\"Thanks for visiting Busy's Diner!\"");
        return order.getDishPrice();
    }

    @Override
    public void describeDish(Dish dish) {
        System.out.println(dish.getDescription());
    }

    @Override
    public String getPrefix() {
        return "SERVER - ";
    }

    @Override
    public void doOrderRoutine(Order o) {
        if (o.isReadyToBeServed())
            deliverFood(o);
        if(o.isReadyToBePaid())
            takePayment(o);
    }
}
