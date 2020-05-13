package com.beijing.lambda.day01;



/*
    表达式4大函数式接口

 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda01 {

    public static void main(String[] args) {

        //1 供给型接口  有get()方法 无参 有返回值
        Supplier<Integer> supplier = ()->{return 1024;};
        System.out.println(supplier.get());

        //2 消费性接口 void accept(T t);一个参数，没有返回值
        Consumer consumer = (x) ->{
            System.out.println(x);
        };
        consumer.accept("124");

        //3 函数型接口 R apply(T t);一个参数，一个返回值
        Function<String,Integer> function = (x)->{return x.length();};
        System.out.println(function.apply("ad"));

        //4 断定型接口 boolean test(T t);，一个参数，返回boolean

        Predicate<String> predicate = (x)->{return x.isEmpty();};
        System.out.println(predicate.test("qw"));

    }
}
