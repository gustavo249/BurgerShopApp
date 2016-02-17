import java.util.List;

/**
 * Created by Gustavo on 15/02/2016.
 */
public class DeluxeBurger extends Hamburger {
    private String name;
    private List<String> additions;

    public DeluxeBurger() {
        super(5.0, "Cheesburger bread");
        name = "Deluxe Burger";
        additions.add("Chips");
        additions.add("Drinks");
    }

    @Override
    public List<String> getAdditions() {
        return additions;
    }

    @Override
    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }

    @Override
    public String getName() {
        return name;
    }
}
