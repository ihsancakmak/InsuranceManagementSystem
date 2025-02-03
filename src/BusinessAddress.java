public class BusinessAddress implements Address{
    private String address;

    public BusinessAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddressDetails() {
        return "Business Address: " + address;
    }
}
