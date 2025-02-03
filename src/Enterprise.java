public class Enterprise extends Account{
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        insurance.setPrice(insurance.getPrice() * 1.2); // 20% markup
        super.getInsurances().add(insurance);
    }
}
