package com.dongnao.rxjavaframwork;

/**
 * Created by Administrator on 2017/2/15 0015.
 * T 羊
 * R 铁
 */

public interface Operator<T,R> extends Func1<Subscrible<? super T>,Subscrible<? super  R>>{
}
