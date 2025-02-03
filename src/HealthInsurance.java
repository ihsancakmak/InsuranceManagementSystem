import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(double price, Date startDate, Date endDate) {
        super("Health Insurance", price, startDate, endDate);
    }

    @Override
    public void calculate() {
        setPrice(getPrice() * 1.15); // Example calculation
    }
}
