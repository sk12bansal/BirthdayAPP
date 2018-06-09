package com.sk.BirthDayManager.app;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.sk.BirthDayManager.R;

import static com.facebook.FacebookSdk.getApplicationContext;

public class SigninFragment extends Fragment {

    private LoginButton loginButton;
    private CallbackManager callbackManager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.signin_fragment,container,false);
        callbackManager = CallbackManager.Factory.create();

        loginButton =view.findViewById(R.id.fb_button);

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Toast.makeText(getApplicationContext(),"sucess".toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancel() {
                // App code
                Toast.makeText(getApplicationContext(),"cancel".toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(FacebookException e) {
                // App code
                Toast.makeText(getApplicationContext(),"error".toString(),Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
