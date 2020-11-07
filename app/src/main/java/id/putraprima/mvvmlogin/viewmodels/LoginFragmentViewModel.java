package id.putraprima.mvvmlogin.viewmodels;

import android.os.Bundle;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.User;

public class LoginFragmentViewModel extends ViewModel {
    private String email = "mirzarayhan22@gmail.com";
    private String password = "mirza";

    private MutableLiveData<User> loginModelMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> loggedMutableLive = new MutableLiveData<>();
    private MutableLiveData<String> errorEmail = new MutableLiveData<>();
    private MutableLiveData<String> errorPassword = new MutableLiveData<>();
    private MutableLiveData<Bundle> bundleMutableLiveData = new MutableLiveData<>();
    public User user;

    public LoginFragmentViewModel(User user) {
        this.user = user;
        this.loginModelMutableLiveData.setValue(this.user);
    }

    public LiveData<User> getLogin() {
        return this.loginModelMutableLiveData;
    }

    public LiveData<Boolean> loggedLiveData() {
        return this.loggedMutableLive;
    }

    public LiveData<String> getErrorUsername() {
        return this.errorEmail;
    }

    public LiveData<String> getErrorPass() {
        return this.errorPassword;
    }

    public LiveData<Bundle> bundleLiveData() {
        return this.bundleMutableLiveData;
    }

    public void doLogin() {
        Log.d("Email", user.email);
        Log.d("Pass", user.password);
        loggedMutableLive.setValue(false);

        if (user.email.equals(email) && user.password.equals(password)) {
            loginModelMutableLiveData.setValue(user);
            loggedMutableLive.setValue(true);
            return;
        } else if (user.isEmailValid()) {
            loginModelMutableLiveData.setValue(user);
            loggedMutableLive.setValue(true);
            return;
        } else if (user.email.isEmpty() && user.password.isEmpty()) {
            errorEmail.setValue("Masukkan alamat email Anda"); // set pesan
            errorPassword.setValue("Masukkan password Anda"); // set pesan
            loggedMutableLive.setValue(false);
            return;
        } else if (user.email.equals(email) && user.password.isEmpty() || user.password == null || !user.password.equals(password)) {
            errorPassword.setValue("Masukkan password Anda");
            loggedMutableLive.setValue(false);
            return;
        } else if (user.email.isEmpty() || user.email == null && user.password.equals(password)) {
            errorEmail.setValue("Masukkan alamat email Anda");
            loggedMutableLive.setValue(false);
            return;
        } else if (!user.email.equals(email) || !user.password.equals(password)) {
            errorEmail.setValue("Masukkan alamat email Anda dengan benar");
            errorPassword.setValue("Masukkan password Anda dengan benar");
            loggedMutableLive.setValue(false);
            return;
        }

    }
}