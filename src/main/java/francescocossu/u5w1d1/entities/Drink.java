package francescocossu.u5w1d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Drink {

    private String name;
    private double price;
    private int calories;
    private double liters;
    private int alcohol_percentage;


    public Drink(String name, double price, int calories, double liters, int alcohol_percentage) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.liters = liters;
        this.alcohol_percentage = alcohol_percentage;
    }
}
