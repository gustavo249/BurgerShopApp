import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gustavo on 15/02/2016.
 */
public class HealthyBurger extends Hamburger {

    private String meat;
    private String name;
    private List<String> additions = new ArrayList<>();
    private List<String> clientAdditions = new ArrayList<>();

    public HealthyBurger() {
        super(4.0, "rye brown bread");
        name = "Healthy Burger";
        setAdditions(clientAdditions);
    }

    @Override
    public List<String> getAdditions() {
        return additions;
    }

    @Override
    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }
}

