package model;

public interface IHost {
    String getPrefix();
    void doOrderRoutine(Order o);

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
