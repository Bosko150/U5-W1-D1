package francescocossu.u5w1d1;


import francescocossu.u5w1d1.entities.Drink;
import francescocossu.u5w1d1.entities.Pizza;
import francescocossu.u5w1d1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanConfig {

    @Bean
    public Topping Onions() {
        return new Topping("Onions", 0.50, 10);
    }

    public Topping Ham() {
        return new Topping("Ham", 1.00, 10);
    }

    public Topping Pineapple() {
        return new Topping("Pineapple", 1.00, 10);

    }

    public Topping Salami() {
        return new Topping("Pepperoni", 1.00, 10);
    }

    @Bean
    public Pizza Hawaiian() {
        return new Pizza("Hawaiian", 5.00, 1000, List.of(Ham(), Pineapple()));

    }

    @Bean
    public Pizza Pepperoni() {
        return new Pizza("Pepperoni", 6.00, 1000, List.of(Salami()));
    }

    @Bean
    public Pizza Margherita() {
        return new Pizza("Margherita", 4.00, 1000, List.of());
    }

    @Bean
    public Drink Lemonade() {
        return new Drink("Lemonade", 1.29, 120, 0.33, 0);
    }

    @Bean
    public Drink Water() {
        return new Drink("Water", 1.00, 0, 0.5, 0);
    }

    @Bean
    public Drink Wine() {
        return new Drink("Wine", 7.00, 600, 0.75, 12);
    }


}
