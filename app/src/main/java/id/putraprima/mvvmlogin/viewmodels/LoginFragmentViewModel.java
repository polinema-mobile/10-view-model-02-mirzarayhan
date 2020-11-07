package id.putraprima.mvvmlogin.viewmodels;

import android.os.Bundle;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

import com.google.android.material.internal.NavigationMenu;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.models.LoginUser;

public class LoginFragmentViewModel extends ViewModel {


    private MutableLiveData<LoginUser> loginModelMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> loggedMutableLive = new MutableLiveData<>();
    private MutableLiveData<String> errorEmail = new MutableLiveData<>();
    private MutableLiveData<String> errorPassword = new MutableLiveData<>();
    private MutableLiveData<Bundle> bundleMutableLiveData = new MutableLiveData<>();
    public LoginUser user;

    public LoginFragmentViewModel(LoginUser user) {
        this.user = user;
        this.loginModelMutableLiveData.setValue(this.user);
    }

    public LiveData<LoginUser> getLogin() {
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
        loginModelMutableLiveData.setValue(user);
        loggedMutableLive.setValue(true);
        return;
    }
}