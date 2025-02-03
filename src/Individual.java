public class Individual extends Account{
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        insurance.setPrice(insurance.getPrice() * 1.1); // 10% markup
        super.getInsurances().add(insurance);
    }
}
