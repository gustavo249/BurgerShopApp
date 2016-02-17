import javax.swing.*;

/**
 * Created by Gustavo on 15/02/2016.
 */
public class Controller {
    public static void startController() {

        String[] burgers = {
                "Simple",
                "Healthy",
                "Deluxe"
        };

        //options for simple burger

        String[] options = {
                "lettuce",
                "tomato",
                "cucumber",
                "carrot",
                "DONE"
        };

        //options for healthy burger

        String[] healthyOptions = {
                "lettuce",
                "onions",
                "beans",
                "cheese",
                "salami",
                "bacon",
                "DONE"
        };

        int burgerChoice = JOptionPane.showOptionDialog(null, "What kind of burger do you want ?",
                null, JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, burgers, burgers[1]);
        switch (burgerChoice) {
            case 0:
                Hamburger hamburger = new Hamburger(2.0, "white bread");

                hamburger.setAdditions(hamburger.createAdditions(options));
                hamburger.setMeat(hamburger);
                hamburger.calculatePrice(hamburger);
                JOptionPane.showMessageDialog(null,"You ordered a " +
                        hamburger.getName() + " and the total is: " + Double.toString(hamburger.getPrice()) + "$");

                break;
            case 1:
                HealthyBurger healthyBurger = new HealthyBurger();
                healthyBurger.setAdditions(healthyBurger.createAdditions(healthyOptions));
                healthyBurger.setMeat(healthyBurger);
                healthyBurger.calculatePrice(healthyBurger);
                JOptionPane.showMessageDialog(null, "You ordered a " + healthyBurger.getName() +
                        " the total is: " + Double.toString(healthyBurger.getPrice()) + "$");
                break;
            case 2:
                DeluxeBurger deluxeBurger = new DeluxeBurger();
                deluxeBurger.setMeat(deluxeBurger);
                deluxeBurger.calculatePrice(deluxeBurger);
                JOptionPane.showMessageDialog(null, "You ordered a " + deluxeBurger.getName() + " which comes with " +
                deluxeBurger.getAdditions().get(0) + " & "+ deluxeBurger.getAdditions().get(1) +
                " and the total is " + Double.toString(deluxeBurger.getPrice()) + "$");
                break;
        }
    }
}
