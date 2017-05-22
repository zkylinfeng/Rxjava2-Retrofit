package com.android.zouky.mylibrary.base;

/**
 * Created by Administrator on 2017/5/22.
 */

public abstract class DataCallBack<T> extends BaseCallBack<T> {

    @Override
    public void onNext(T o) {
        super.onNext(o);
    }

    public abstract void onSuccess(T t);

}
