package ui;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Diner {

    public static void main(String[] args) {
        Dish dish = generateTurkeyClubSandwich();
        Servable  server = new Server();
        Chef chef = new Chef();
        Servable host = new Host();

        //Table 1
        System.out.println("Table " + 1 + ":\n");

        server.greet();
        server.describeDish(dish);
        Order o = server.takeOrder(dish);

        System.out.println();
        chef.makeDish(o);

        server.doOrderRoutine(o);
        System.out.println();


        //Table 2
        System.out.println("Table " + 2 + ":\n");

        host.greet();
        host.describeDish(dish);

        Order o2 = server.takeOrder(dish);
        System.out.println();
        chef.makeDish(o2);

        host.doOrderRoutine(o2);
        server.doOrderRoutine(o2);

        System.out.println();
        chef.doDishes();
    }

    private static Dish generateTurkeyClubSandwich() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("avocado");
        ingredients.add("sriracha");
        ingredients.add("cheddar cheese");
        ingredients.add("bread");
        ingredients.add("lettuce");
        ingredients.add("tomato");
        ingredients.add("turkey");
        ingredients.add("bacon");
        return new Dish("Turkey club sandwich",
                "\"Our trendy sandwich has avocado, sriracha sauce, cheese, veggies, turkey and bacon.\"",
                ingredients,
                "\t1. Pour sriracha\n\t2. Spread avocado\n\t3. Stack meat\n\t4. Place veggies");
    }

}
