package com.example.mockito.login;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LoginModelTest {

    @Mock
    private Login.Presenter presenter;

    private LoginModel model;

    @Before
    public void setUp() throws Exception{
        model = new LoginModel(presenter);
    }


    @Test
    public void shouldSuccesWithValidUserandPass() throws Exception{
        model.validaUser("fran","fr");
        verify(presenter).usarioValido();
    }

    @Test
    public void shoudNotSucessWithUserandPass() throws Exception{
        model.validaUser("pepe","androiddesdecero");
        verify(presenter).error();
    }

}