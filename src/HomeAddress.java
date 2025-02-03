public class HomeAddress implements Address{
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressDetails() {
        return "Home Address: " + address;
    }
}
