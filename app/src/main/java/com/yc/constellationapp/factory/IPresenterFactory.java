package com.yc.constellationapp.factory;

import com.yc.constellationapp.presenter.BasePresenter;
import com.yc.constellationapp.ui.iview.IBaseView;

/**
 * @author yc
 * @date 2018/8/2
 * @description Presenter工厂接口
 */
public interface IPresenterFactory<V extends IBaseView,P extends BasePresenter<V>> {

    /**
     * 创建Presenter的接口方法
     * @return 需要创建的Presenter
     */
    P createPresenter();
}
