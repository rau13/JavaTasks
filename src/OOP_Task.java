import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class OOP_Task {
    public static void main(String[] args){
        User user1 = new User();
        user1.setEmail("rauan5005@gmail.com");
        System.out.println(user1.getEmail());
        user1.setPassword("rauan123456789");
        System.out.println(user1.getPassword());

    }
}
class User{
    private String email;
    private String Login;
    private String Password;



    public void setEmail(String email) {
        this.email = email;

    }
    public String getEmail() {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return email + " - Email is valid";
        }else{
            return email + " - Email is invalid";
        }
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getLogin() {
        return Login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        if (Password == null) {
            return "Password is empty";
        }else{
            return Password + " - Password is valid";
        }


    }
}
