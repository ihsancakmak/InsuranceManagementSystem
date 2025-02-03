import java.util.ArrayList;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profession;
    private int age;
    private ArrayList<Address> addressList;
    private Date lastLogin;

    public User(String firstName, String lastName, String email, String password, String profession, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        this.addressList = new ArrayList<>();
        this.lastLogin = new Date();
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }
}
