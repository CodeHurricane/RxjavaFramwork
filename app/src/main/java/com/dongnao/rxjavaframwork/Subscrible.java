package com.dongnao.rxjavaframwork;

/**
 * Created by Administrator on 2017/2/13 0013.
 *
 * 角色 ：铁匠
 * T  代表具备的能力    会用铁做生活用具
 */

public abstract  class Subscrible<T> {
    //T  t
    public abstract void onNext(T t);
}
