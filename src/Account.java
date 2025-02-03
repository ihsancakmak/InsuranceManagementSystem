import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

enum AuthenticationStatus {
    SUCCESS, FAIL;
}

public abstract class Account implements Comparable<Account>{
    private User user;
    private ArrayList<Insurance> insurances;
    private AuthenticationStatus status;

    public Account(User user) {
        this.user = user;
        this.insurances = new ArrayList<>();
        this.status = AuthenticationStatus.FAIL;
    }

    public final void showUserInfo() {
        System.out.println("User Info:");
        System.out.println("Name: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Profession: " + user.getProfession());
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            status = AuthenticationStatus.SUCCESS;
            user.setLastLogin(new Date());
        } else {
            throw new InvalidAuthenticationException("Invalid email or password.");
        }
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void addAddress(Address address) {
        AddressManager.addAddress(user, address);
    }

    public void removeAddress(Address address) {
        AddressManager.removeAddress(user, address);
    }

    public abstract void addInsurance(Insurance insurance);

    @Override
    public int compareTo(Account o) {
        return this.user.getEmail().compareTo(o.user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(user.getEmail());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return Objects.equals(user.getEmail(), account.user.getEmail());
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }
}
