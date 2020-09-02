package com.example.mockito.login;

public interface Login {
    interface View{
        void usarioValido();
        void error();
        String getUserName();
        String getPassword();
    }
    interface Presenter{
        void validaUser(String user, String pass);
        void usarioValido();
        void error();
    }
    interface Model{
        void validaUser(String user, String pass);
    }
}