import java.util.Date;

public abstract class Insurance {
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;

    public Insurance(String name, double price, Date startDate, Date endDate) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void calculate();
}
