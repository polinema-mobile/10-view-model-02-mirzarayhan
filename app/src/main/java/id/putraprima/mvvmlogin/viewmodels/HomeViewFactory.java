package id.putraprima.mvvmlogin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.mvvmlogin.models.Login;

public class HomeViewFactory implements ViewModelProvider.Factory {

    private Login login;

    public HomeViewFactory(Login login) {
        this.login = login;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(HomeViewModel.class)){
            return (T) new HomeViewModel(login);
        }
        throw new IllegalArgumentException("Unknown View Model");
    }
}
