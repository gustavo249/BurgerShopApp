import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gustavo on 15/02/2016.
 */
public class Hamburger {
    private String breadType;
    private String meat;
    private List<String> additions = new ArrayList<String>();
    private double price;
    private String name;


    private List<String> clientAdditions = new ArrayList<>();
    public Hamburger(double price, String breadType) {
        this.price = price;
        this.breadType = breadType;
        this.meat = "beaf";
        this.name = "Simple Hamburger";
        setAdditions(clientAdditions);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void calculatePrice(Hamburger hamburger) {
        double newPrice;
        if (hamburger.getAdditions().size() != 0) {
            newPrice = hamburger.getPrice() + (hamburger.getAdditions().size());
        } else {
            newPrice = hamburger.getPrice();
        }
        hamburger.setPrice(newPrice);
    }

    public List<String> createAdditions(String[] options) {
        clientAdditions = new ArrayList<>();

        int i = 0;
        while (i < options.length) {
            int choice = JOptionPane.showOptionDialog(null, "After you select what you want on your burger press DONE",
                    null, JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice == options.length - 1) {
                return clientAdditions;
            } else if (choice == i) {
                clientAdditions.add(options[i]);
                System.out.println(options[i] + " added to your burger");
            }
            i++;
        }
        return clientAdditions;
    }

    public List<String> getAdditions() {
        return additions;
    }

    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }

    public void setMeat(Hamburger hamburger) {
        String[] options = {
                "Pork meat",
                "Beaf",
                "Chicken meat",
                "Vegetarian meat"
        };
        int choice = JOptionPane.showOptionDialog(null, "What meat do you want ?", null, JOptionPane.YES_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        hamburger.meat = options[choice];
    }

    public String getName() {
        return name;
    }
}
