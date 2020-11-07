package id.putraprima.mvvmlogin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.mvvmlogin.models.LoginUser;

public class LoginFragmentViewModelFactory implements ViewModelProvider.Factory {
    private LoginUser user;

    public LoginFragmentViewModelFactory(LoginUser user) {
        this.user = user;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LoginFragmentViewModel.class)){
            return (T) new LoginFragmentViewModel(user);
        }
        throw new IllegalArgumentException("Unknown ViewModel Class");
    }
}
