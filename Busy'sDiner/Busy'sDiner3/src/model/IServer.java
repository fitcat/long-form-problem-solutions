package model;

public interface IServer extends IHost {

    Order takeOrder(Dish dish);

    double takePayment(Order o);
}
