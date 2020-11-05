package id.putraprima.mvvmlogin.models;

import android.util.Patterns;

public class Login {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEmailValid() {
        return Patterns.EMAIL_ADDRESS.matcher(getUsername()).matches();
    }


    public boolean isPasswordLengthGreaterThan5() {
        return getPassword().length() > 5;
    }


    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Login() {

    }
}
