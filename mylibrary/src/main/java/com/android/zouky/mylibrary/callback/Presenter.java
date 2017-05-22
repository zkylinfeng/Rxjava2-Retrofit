package com.android.zouky.mylibrary.callback;

/**
 * Created by Administrator on 2017/5/22.
 */

public interface Presenter<V> {
    void registerView(V view);

    void unRegisterView();
}
