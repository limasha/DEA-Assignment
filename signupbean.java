
import java.io.Serializable;

public class signupbean implements Serializable{
    private String firstname;
    private String lastname;
    private String username;
    private String address;
    private int counumber;
    private String email;
    private String password; 

    
    public String getFirstname() {
        return firstname;
    }

    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    public String getLastname() {
        return lastname;
    }

   
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    
    public int getCounumber() {
        return counumber;
    }

   
    public void setCounumber(int counumber) {
        this.counumber = counumber;
    }

  
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
