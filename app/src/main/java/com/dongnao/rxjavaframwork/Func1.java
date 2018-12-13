package com.dongnao.rxjavaframwork;

/**
 * Created by Administrator on 2017/2/15 0015.
 * 抽象的换的行为
 * T 代表 养羊人的角色
 * R  代表 打铁人的角色
 */

public interface Func1<T,R> {
    R call(T t);
}
