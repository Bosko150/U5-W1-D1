package francescocossu.u5w1d1.entities;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pizza {
    private String name;
    private double price;
    private int calories;
    private List<Topping> toppings;


    public Pizza(String name, double price, int calories, List<Topping> toppings) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppings = pizzaToppings(toppings);
    }


    public List<Topping> pizzaToppings(List<Topping> toppings) {
        Topping tomato = new Topping("Tomato", 1.00, 10);
        Topping mozzarella = new Topping("Mozzarella", 1.00, 10);
        List<Topping> baseToppings = new ArrayList<>();
        baseToppings.add(tomato);
        baseToppings.add(mozzarella);
        baseToppings.addAll(toppings);
        return baseToppings;
    }
}






