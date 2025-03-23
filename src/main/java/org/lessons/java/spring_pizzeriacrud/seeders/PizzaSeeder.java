package org.lessons.java.spring_pizzeriacrud.seeders;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.lessons.java.spring_pizzeriacrud.models.Pizza;
import org.lessons.java.spring_pizzeriacrud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.datafaker.Faker;

@Component  //!recognize this as Spring Bean
public class PizzaSeeder {
    
    private final PizzaRepository pizzaRepository;
    private final Faker faker = new Faker();

    @Autowired  //!Inject an instance of PizzaRepository into this PizzaSeeder instance. From Spring v4.3+, explicit @... annotation is not necessary if there is only ONE constructor.
    public PizzaSeeder(PizzaRepository pizzaRepository){
        this.pizzaRepository = pizzaRepository;
    }

    public void seed(){
        // List<Pizza> pizzas = new ArrayList<>();
        // for(int i=0; i<num; i++){
        //     pizzas.add(new Pizza(
        //         null,
        //         faker.food().dish(),
        //         faker.lorem().sentence(),
        //         faker.internet().image(),
        //         BigDecimal.valueOf(faker.number().randomDouble(2, 5, 30))
        //     ));
        // }
        // pizzaRepository.saveAll(pizzas);

        if(pizzaRepository.count() == 0){
            List<Pizza> pizzas = List.of(

            new Pizza(null, "Margherita", "Pomodoro, mozzarella, basilico.", "margherita.jpeg", BigDecimal.valueOf(6.50), Set.of("vegetarian", "halal", "gluten-free")),
            new Pizza(null, "Marinara", "Pomodoro, aglio, origano, olio EVO.", "marinara.jpg", BigDecimal.valueOf(6.50), Set.of("vegetarian", "halal", "gluten-free")),
            new Pizza(null, "Diavola", "Pomodoro, mozzarella, salame piccante.", "diavola.jpg", BigDecimal.valueOf(7.50), Set.of("gluten-free")),
            new Pizza(null, "Quattro Formaggi", "Mozzarella, gorgonzola, fontina, parmigiano.", "quattro-formaggi.jpg", BigDecimal.valueOf(8.00), Set.of("vegetarian", "halal", "gluten-free")),
            new Pizza(null, "Capricciosa", "Pomodoro, mozzarella, funghi, carciofi, prosciutto, olive.", "capricciosa.jpg", BigDecimal.valueOf(8.50), Set.of("gluten-free")),
            new Pizza(null, "Prosciutto e Funghi", "Pomodoro, mozzarella, prosciutto cotto, funghi.", "prosciutto-funghi.jpg", BigDecimal.valueOf(7.50), Set.of("gluten-free")),
            new Pizza(null, "Napoli", "Pomodoro, mozzarella, acciughe, capperi, origano.", "napoli.png", BigDecimal.valueOf(7.00), Set.of("gluten-free")),
            new Pizza(null, "Boscaiola", "Mozzarella, salsiccia, funghi.", "boscaiola.jpg", BigDecimal.valueOf(8.50), Set.of()),  //no gluten-free no vegetarian no halal!
            new Pizza(null, "Ortolana", "Pomodoro, mozzarella, verdure grigliate.", "ortalana.jpg", BigDecimal.valueOf(8.00), Set.of("vegetarian", "halal", "gluten-free")),
            new Pizza(null, "Tonno e Cipolla", "Pomodoro, mozzarella, tonno, cipolla.", "tonno-cipolla.jpg", BigDecimal.valueOf(7.50), Set.of("halal", "gluten-free")),
            new Pizza(null, "Frutti di Mare", "Pomodoro, frutti di mare, prezzemolo.", "frutti-mare.jpg", BigDecimal.valueOf(9.00), Set.of("halal", "gluten-free")),
            new Pizza(null, "Tartufo", "Mozzarella, tartufo nero, burrata.", "tartufo.jpeg", BigDecimal.valueOf(12.00), Set.of("vegetarian", "halal", "gluten-free")),
            new Pizza(null, "Parmigiana", "Pomodoro, mozzarella, melanzane fritte, parmigiano.", "parmigiana.jpg", BigDecimal.valueOf(8.50), Set.of("vegetarian", "halal")),
            new Pizza(null, "Bufalina", "Pomodoro, mozzarella di bufala, basilico.", "bufalina.jpg", BigDecimal.valueOf(9.00), Set.of("vegetarian", "halal", "gluten-free")),
            new Pizza(null, "Americana", "Pomodoro, mozzarella, wurstel, patatine fritte.", "americana.jpg", BigDecimal.valueOf(7.50), Set.of()),  //no gluten-free no vegetarian no halal!
            new Pizza(null, "Pistacchio e Stracciatella", "Mozzarella, pistacchio, stracciatella.", "pistacchio-stracciatella.jpg", BigDecimal.valueOf(9.50), Set.of("vegetarian", "halal", "gluten-free")),
            new Pizza(null, "Salsiccia e Friarielli", "Mozzarella, salsiccia, friarielli.", "salsiccia-friarielli.jpg", BigDecimal.valueOf(9.00), Set.of("gluten-free")),
            new Pizza(null, "Gorgonzola e Noci", "Mozzarella, gorgonzola, noci, miele.", "gorgonzola-noci.jpeg", BigDecimal.valueOf(10.00), Set.of("vegetarian", "halal", "gluten-free")),
            new Pizza(null, "Crudo e Rucola", "Mozzarella, prosciutto crudo, rucola, scaglie di parmigiano.", "crudo-rucola.jpg", BigDecimal.valueOf(9.50), Set.of("gluten-free")),
            new Pizza(null, "Nutella", "Nutella.", "nutella.jpg", BigDecimal.valueOf(6.00), Set.of("vegetarian", "halal", "gluten-free"))


            // new Pizza(null, "Margherita", "Pomodoro, mozzarella, basilico.", "margherita.jpeg", BigDecimal.valueOf(6.50)),
            // new Pizza(null, "Marinara", "Pomodoro, aglio, origano, olio EVO.", "marinara.jpg", BigDecimal.valueOf(6.50)),
            // new Pizza(null, "Diavola", "Pomodoro, mozzarella, salame piccante.", "diavola.jpg", BigDecimal.valueOf(7.50)),
            // new Pizza(null, "Quattro Formaggi", "Mozzarella, gorgonzola, fontina, parmigiano.", "quattro-formaggi.jpg", BigDecimal.valueOf(8.00)),
            // new Pizza(null, "Capricciosa", "Pomodoro, mozzarella, funghi, carciofi, prosciutto, olive.", "capricciosa.jpg", BigDecimal.valueOf(8.50)),
            // new Pizza(null, "Prosciutto e Funghi", "Pomodoro, mozzarella, prosciutto cotto, funghi.", "prosciutto-funghi.jpg", BigDecimal.valueOf(7.50)),
            // new Pizza(null, "Napoli", "Pomodoro, mozzarella, acciughe, capperi, origano.", "napoli.png", BigDecimal.valueOf(7.00)),
            // new Pizza(null, "Boscaiola", "Mozzarella, salsiccia, funghi.", "boscaiola.jpg", BigDecimal.valueOf(8.50)),
            // new Pizza(null, "Ortolana", "Pomodoro, mozzarella, verdure grigliate.", "ortalana.jpg", BigDecimal.valueOf(8.00)),
            // new Pizza(null, "Tonno e Cipolla", "Pomodoro, mozzarella, tonno, cipolla.", "tonno-cipolla.jpg", BigDecimal.valueOf(7.50)),
            // new Pizza(null, "Frutti di Mare", "Pomodoro, frutti di mare, prezzemolo.", "frutti-mare.jpg", BigDecimal.valueOf(9.00)),
            // new Pizza(null, "Tartufo", "Mozzarella, tartufo nero, burrata.", "tartufo.jpeg", BigDecimal.valueOf(12.00)),
            // new Pizza(null, "Parmigiana", "Pomodoro, mozzarella, melanzane fritte, parmigiano.", "parmigiana.jpg", BigDecimal.valueOf(8.50)),
            // new Pizza(null, "Bufalina", "Pomodoro, mozzarella di bufala, basilico.", "bufalina.jpg", BigDecimal.valueOf(9.00)),
            // new Pizza(null, "Americana", "Pomodoro, mozzarella, wurstel, patatine fritte.", "americana.jpg", BigDecimal.valueOf(7.50)),
            // new Pizza(null, "Pistacchio e Stracciatella", "Mozzarella, pistacchio, stracciatella.", "pistacchio-stracciatella.jpg", BigDecimal.valueOf(9.50)),
            // new Pizza(null, "Salsiccia e Friarielli", "Mozzarella, salsiccia, friarielli.", "salsiccia-friarielli.jpg", BigDecimal.valueOf(9.00)),
            // new Pizza(null, "Gorgonzola e Noci", "Mozzarella, gorgonzola, noci, miele.", "gorgonzola-noci.jpeg", BigDecimal.valueOf(10.00)),
            // new Pizza(null, "Crudo e Rucola", "Mozzarella, prosciutto crudo, rucola, scaglie di parmigiano.", "crudo-rucola.jpg", BigDecimal.valueOf(9.50)),
            // new Pizza(null, "Nutella", "Nutella.", "nutella.jpg", BigDecimal.valueOf(6.00))

            );
            pizzaRepository.saveAll(pizzas);
        }
    }
}
