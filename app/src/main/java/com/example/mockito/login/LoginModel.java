package com.example.mockito.login;

public class LoginModel implements Login.Model {

    private Login.Presenter presenter;

    public LoginModel(Login.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void validaUser(String user, String pass) {
        if (user.equals("fran")&& pass.equals("fr")){
            presenter.usarioValido();
            //presenter.validaUser(user,pass);
        }else if (user.equals("fran2")&& pass.equals("fr2")){
            presenter.usarioValido();
        }else{
            presenter.error();
        }
    }
}