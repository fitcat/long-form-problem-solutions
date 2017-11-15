package model;

public class Host implements IHost {

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
