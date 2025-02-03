import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(double price, Date startDate, Date endDate) {
        super("Travel Insurance", price, startDate, endDate);
    }

    @Override
    public void calculate() {
        setPrice(getPrice() * 1.1); // Example calculation
    }
}

