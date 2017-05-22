package com.android.zouky.mylibrary.base;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * Created by Administrator on 2017/5/22.
 */

public class BaseCallBack<T> implements Subscriber<T> {
    @Override
    public void onSubscribe(Subscription s) {

    }

    @Override
    public void onNext(T o) {

    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onComplete() {

    }
}
