package com.android.zouky.mylibrary.base;

import com.android.zouky.mylibrary.callback.Presenter;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/5/22.
 */

public class BasePresenter<V> implements Presenter<V> {
    public CompositeDisposable compositeDisposable;
    public V view;

    @Override
    public void registerView(V view) {
        this.view = view;
    }

    @Override
    public void unRegisterView() {
        view = null;
        if (compositeDisposable != null && compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void add(Flowable flowable, Consumer onNext) {
        compositeDisposable.add(flowable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(onNext));
    }
}
