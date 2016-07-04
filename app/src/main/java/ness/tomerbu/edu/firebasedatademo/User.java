package ness.tomerbu.edu.firebasedatademo;

/**
 * Created by android on 04/07/2016.
 */
public class User {
    private String email;
    private String UID;

    //POJO
    public User() {
    }

    public User(String email, String UID) {

        this.email = email;
        this.UID = UID;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }


}
