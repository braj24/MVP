package com.bhushansingh.mvpexample.model;

import android.text.TextUtils;

import com.bhushansingh.mvpexample.presenter.SignInPresenter;
import com.bhushansingh.mvpexample.view.SignInView;

public class SignInModel implements SignInPresenter {

    private SignInView signInView;


    public SignInModel(SignInView signInView) {
        this.signInView = signInView;
    }

    @Override
    public void signIn(String name, String password) {

        if (TextUtils.equals(name, "") || TextUtils.equals(password, ""))
            signInView.validationError();

        if (TextUtils.equals(name, "Bhushan Singh") && TextUtils.equals(password, "1234")) {
            signInView.signInSuccess();
        } else
            signInView.signInFailure();
    }
}
