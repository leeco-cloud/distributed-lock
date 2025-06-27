package com.leeco.cloud.lock.redis.redislock.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * redis分布式锁
 * @author liuqiang-068
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Lock {

    /**
     * 是否可重入 默认不可重入
     */
    boolean reentrant() default false;

    /**
     * 首次上锁 锁过期时间(单位:秒)
     * 默认3秒
     */
    int defaultExpirationTime() default 3;

    /**
     * 续期次数 默认-1
     * -1:无限续期
     * 0 :不续期
     */
    int threshold() default -1;

    /**
     * 锁续期时间(单位:秒)
     * 默认3秒
     */
    int refreshKeyTime() default 3;

}
