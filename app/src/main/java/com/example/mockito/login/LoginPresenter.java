package com.example.mockito.login;

public class LoginPresenter implements Login.Presenter {

    private Login.View view;
    private Login.Model model;

    public LoginPresenter(Login.View view){
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void validaUser(String user, String pass) {
        if(view!=null){
            //model.validaUser(user, pass);
            model.validaUser("fran", "fr");
        }
    }

    @Override
    public void usarioValido() {
        if(view!=null){
            view.usarioValido();
        }
    }

    @Override
    public void error() {
        if(view!=null){
            view.error();
        }
    }
}