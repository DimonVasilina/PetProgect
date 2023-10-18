package authentication;

public class UsersCredentials {
    private String email;
    private String password;

    public UsersCredentials (String email, String password){
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword(){
        return password;
    }
}
