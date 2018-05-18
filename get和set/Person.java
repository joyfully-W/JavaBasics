
/*
 * 
 * 	  this关键字：
 *		 区分成员变量和局部变量同名的情况
 *		this.成员变量
 */

public class Person {
	
	//私有变量 必须要提供set和get方法
	private int age;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	//变量age被私有，只能提供方法让外面的类使用
	public void setAge(int age) {
		this.age=age;
	}
	
	public void put() {
		System.out.println(name+"...."+age);
	}
	
}
