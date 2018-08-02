package com.yc.constellationapp.presenter;

import com.yc.constellationapp.model.impl.LoginModel;
import com.yc.constellationapp.ui.iview.ILoginView;

public class LoginPresenter extends BasePresenter<ILoginView>{

    private LoginModel loginModel;

    public LoginPresenter(LoginModel loginModel) {
        this.loginModel = loginModel;
    }
}
