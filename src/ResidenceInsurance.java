import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(double price, Date startDate, Date endDate) {
        super("Residence Insurance", price, startDate, endDate);
    }

    @Override
    public void calculate() {
        setPrice(getPrice() * 1.2); // Example calculation
    }
}

