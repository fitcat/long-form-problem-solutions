package model;

public interface Servable {
    String getPrefix();
    void doOrderRoutine(Order o);

    default Order takeOrder(Dish dish) { throw new UnsupportedOperationException(); }

    default double takePayment(Order o) { throw new UnsupportedOperationException(); }

    //EFFECTS: prints out a description of the dish on the menu
    default void describeDish(Dish dish) {
        System.out.println(dish.getDescription());
    }

    //EFFECTS: prints out a greeting
    default void greet() {
        System.out.println("\"Hello and welcome to Busy's, the home of the trendy turkey club sandwich.\"");
    }

    default void deliverFood(Order order) {
        order.setIsServed();
        System.out.print(getPrefix() + "Delivered food: ");
        order.print();
    }

}
