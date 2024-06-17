package francescocossu.u5w1d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pizza {
    private String name;
    private double price;
    private int calories;
    private Topping[] toppings;
}
