package com.example.mockito.login;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by albertopalomarrobledo on 21/7/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    private Login.View view;
    @Mock
    private Login.Model model;

    private LoginPresenter presenter;

    @Before
    public void setUt() throws Exception{
        presenter = new LoginPresenter(view);
    }

    /*@Test
    public void shouldShowErrorMessageWhenUserorPasswordisWrong() throws Exception{
        when(view.getUserName()).thenReturn("fran");
        when(view.getPassword()).thenReturn("aa");
        model.validaUser(view.getUserName(),view.getPassword());
        verify(presenter).error();
    }*/


    @Test
    public void shouldPassWhenUserandPasswordareRight() throws Exception{
        when(view.getUserName()).thenReturn("fran");
        when(view.getPassword()).thenReturn("fr");
        presenter.validaUser(view.getUserName(),view.getPassword());
        verify(view).usarioValido();

    }
    @Test
    public void shouldPassWhenUserandPasswordareRight2() throws Exception{
        when(view.getUserName()).thenReturn("fran2");
        when(view.getPassword()).thenReturn("fr2");
        presenter.validaUser(view.getUserName(),view.getPassword());
        verify(view).usarioValido();

    }


}