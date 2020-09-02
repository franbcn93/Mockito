package com.example.mockito.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mockito.R;
import com.example.mockito.finalactivity.FinalActivity;

public class LoginActivity extends AppCompatActivity implements Login.View, View.OnClickListener {
    private EditText user,pass;
    private Login.Presenter presenter;
    private Button btnAccept;
    private LoginModel model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //presenter = new LoginPresenter(this);
        user = (EditText)findViewById(R.id.edUser);
        pass = (EditText)findViewById(R.id.edPass);
        btnAccept=(Button)findViewById(R.id.button);
        btnAccept.setOnClickListener(this);
    }


    @Override
    public void usarioValido() {
        startActivity(new Intent(LoginActivity.this, FinalActivity.class));
    }

    @Override
    public void error() {
        Toast.makeText(this, "Usuario no es Valido", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUserName() {
        return user.getText().toString();
    }

    @Override
    public String getPassword() {
        return pass.getText().toString();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:


                presenter = new LoginPresenter(this);
                model = new LoginModel(presenter);
                //model.validaUser("fran","fr");android studio intent
                //model.validaUser(String.valueOf(user),String.valueOf(pass));
                model.validaUser(getUserName(),getPassword());
                if (getUserName() == "fran" && getPassword() == "fr") {
                    Intent intent = new Intent(this, FinalActivity.class);
                    intent.putExtra("input", getUserName());
                    startActivity(intent);
                }
                /**/
                break;
        }
    }
}