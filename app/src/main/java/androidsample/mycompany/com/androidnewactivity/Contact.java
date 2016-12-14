package androidsample.mycompany.com.androidnewactivity;

/**
 * Created by Vaibhav on 12/3/2016.
 */

public class Contact {


    public Contact(String name, String email, String uName, String password) {

        this.name = name;
        this.email = email;
        this.uName = uName;
        this.password = password;
    }

    int id;
    String name;
    String email;
    String uName;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
