package com.bhushansingh.mvpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.bhushansingh.mvpexample.model.SignInModel;
import com.bhushansingh.mvpexample.view.SignInView;

public class MainActivity extends AppCompatActivity implements SignInView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SignInModel signInModel = new SignInModel(MainActivity.this);
        signInModel.signIn("", "12345");
    }

    @Override
    public void validationError() {
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signInSuccess() {

        Toast.makeText(this, "SignIn Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signInFailure() {
        Toast.makeText(this, "SignIn Failure", Toast.LENGTH_SHORT).show();
    }
}
