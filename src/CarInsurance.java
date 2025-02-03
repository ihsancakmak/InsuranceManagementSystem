import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(double price, Date startDate, Date endDate) {
        super("Car Insurance", price, startDate, endDate);
    }

    @Override
    public void calculate() {
        setPrice(getPrice() * 1.25); // Example calculation
    }
}
