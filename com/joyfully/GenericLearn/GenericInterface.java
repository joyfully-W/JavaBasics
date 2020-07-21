package com.joyfully.GenericLearn;
/*
    定义含有泛型的接口
 */


/*
含有泛型的接口,第一种使用方式:定义接口的实现类,实现接口,指定接口的泛型
public interface Iterator<E> {
    E next();
}
Scanner类实现了Iterator接口,并指定接口的泛型为String,所以重写的next方法泛型默认就是String
public final class Scanner implements Iterator<String>{
    public String next() {}
}
*/
/*
含有泛型的接口第二种使用方式:接口使用什么泛型,实现类就使用什么泛型,类跟着接口走
就相当于定义了一个含有泛型的类,创建对象的时候确定泛型的类型
public interface List<E>{
    boolean add(E e);
    E get(int index);
}
public class ArrayList<E> implements List<E>{
    public boolean add(E e) {}
    public E get(int index) {}
}
*/
public interface GenericInterface<I> {
    public abstract void method(I i);
}
