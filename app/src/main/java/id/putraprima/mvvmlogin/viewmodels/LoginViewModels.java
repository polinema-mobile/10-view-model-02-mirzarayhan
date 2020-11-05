package id.putraprima.mvvmlogin.viewmodels;

import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.models.Login;

public class LoginViewModels extends ViewModel {

    public MutableLiveData<Login> loginMutableLiveData = new MutableLiveData<>();
    public Login login = new Login();

    public LiveData<Login> getLogin(){
        return loginMutableLiveData;
    }
    public void login(String username, String password) {

    }


    // A placeholder username validation check
    public MutableLiveData<String> username = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    private MutableLiveData<Login> userMutableLiveData;

    public MutableLiveData<Login> getUser() {

        if (loginMutableLiveData == null) {
            loginMutableLiveData = new MutableLiveData<>();
        }
        return loginMutableLiveData;

    }

    public void onClick(View view) {

        Login loginUser = new Login(username.getValue(), password.getValue());

        Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment);

    }

}
