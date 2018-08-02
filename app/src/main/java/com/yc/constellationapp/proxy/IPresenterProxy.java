package com.yc.constellationapp.proxy;

import com.yc.constellationapp.presenter.BasePresenter;
import com.yc.constellationapp.factory.impl.PresenterFactory;
import com.yc.constellationapp.ui.iview.IBaseView;

/**
 * @author yc
 * @date 2018/8/2
 * @description 代理接口
 */
public interface IPresenterProxy<V extends IBaseView,P extends BasePresenter<V>>{

    /**
     * 设置创建Presenter的工厂
     * @param presenterFactory PresenterFactory类型
     */
    void setPresenterFactory(PresenterFactory<V,P> presenterFactory);

    /**
     * 获取Presenter的工厂类
     * @return 返回PresenterMvpFactory类型
     */
    PresenterFactory<V,P> getPresenterFactory();


    /**
     * 获取创建的Presenter
     * @return 指定类型的Presenter
     */
    P getPresenter();
}
