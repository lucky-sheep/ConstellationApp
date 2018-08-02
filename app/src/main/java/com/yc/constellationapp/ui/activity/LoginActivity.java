package com.yc.constellationapp.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.yc.constellationapp.presenter.LoginPresenter;
import com.yc.constellationapp.factory.annotation.CreatePresenter;
import com.yc.constellationapp.ui.iview.ILoginView;

/**
 * @author yc
 * @date 2018/8/2
 */
@CreatePresenter(LoginPresenter.class)
public class LoginActivity extends BaseActivity<ILoginView,LoginPresenter> implements ILoginView {

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
