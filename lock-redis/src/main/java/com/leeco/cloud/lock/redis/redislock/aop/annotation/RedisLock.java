package com.leeco.cloud.lock.redis.redislock.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * redis分布式锁
 * @author liuqiang@ourdocker.cn
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RedisLock {

    /**
     * 异常抛出异常类型
     */
    Class<? extends Throwable> rollBackFor();

}
