package id.putraprima.mvvmlogin.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.databinding.FragmentLoginBinding;
import id.putraprima.mvvmlogin.models.Login;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModels;

public class LoginFragment extends Fragment {

    private LoginViewModels loginViewModels;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false);
        loginViewModels = new ViewModelProvider(this).get(LoginViewModels.class);
        binding.setLoginViewModels(loginViewModels);
        binding.setLifecycleOwner(this);

        return binding.getRoot();


    }
}