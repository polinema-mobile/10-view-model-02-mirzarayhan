package id.putraprima.mvvmlogin.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.Login;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<Login> loginMutableLiveData = new MutableLiveData<>();
    private Login login;

    public HomeViewModel(Login login) {
        this.login = login;
        this.loginMutableLiveData.setValue(this.login);
    }

    public void doLogin(){
        this.login.setUsername(login.getUsername());
    }

    public LiveData<Login> loginLiveData(){
        return this.loginMutableLiveData;
    }
}
