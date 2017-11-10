package model;

public class Host implements Servable {

    @Override
    public String getPrefix() {
        return "HOST - ";
    }

    @Override
    public void doOrderRoutine(Order o) {
        if (o.isReadyToBeServed())
            deliverFood(o);
    }
}
