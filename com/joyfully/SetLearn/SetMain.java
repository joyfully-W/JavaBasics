package com.joyfully.SetLearn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
java.util.Set接口 extends Collection接口
Set接口的特点:
    1.不允许存储重复的元素
    2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
java.util.HashSet集合 implements Set接口
HashSet特点:
     1.不允许存储重复的元素
     2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
     3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
     4.底层是一个哈希表结构(查询的速度非常的快)
*/
/*
Set集合不允许存储重复元素的原理:
  会根据哈希值判断是否存在哈希冲突 
  如果存在就会调用equals方法对两个元素进行比较
  	如果返回True就认定两个元素相同 不会把元素存在Set集合中
  	如果返回False则认定两个元素不相同 把元素存在Set集合中
*/
public class SetMain {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
        //使用add方法往集合中添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);//1,2,3
        }
        //使用增强for遍历set集合
        System.out.println("-----------------");
        for (Integer i : set) {
            System.out.println(i);
        }
	}
}
