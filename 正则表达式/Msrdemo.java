
/**
 * 
 * @author qwer
 * 
 *         正则表达式相关的方法 
 *         1.匹配
 *          boolean matches(String 正则的规则) "qwer".matches("[q]")
 *         匹配成功返回true 
 *         2.做切割 
 *         String[] split(String 正则的规则) "qwer".split("q")
 *         使用规则将字符串进行切割 
 *         3.做替换 
 *         String replaceAll( String 正则规则,String 字符串)
 *         "abc0123".repalceAll("[\\d]","#")
 * 
 */

public class Msrdemo{
	public static void main(String[] args) {
		repa();

	}
	
	public static void repa() {
		String str = "HEllo123465asdasdadsad54565441";
		System.out.println(str.replaceAll("[0-9]+", "#"));
	}
	
	public static void qiege_1() {
		String str= "111.22.3.44";
		String[] strArr =str.split("\\.");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}
	}
	
	public static void qiege() {
		String str= "11--22---33-----44";
		String[] strArr =str.split("-+");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}
	}
	
	public static void checkNum(String string) {
		System.out.println(string.matches("1[34578][0-9]{9}"));
	}

	public static void check() {
		String qq = "123456";
		boolean b = qq.matches("[1-9][0-9]{4,9}");
		System.out.println(b);
	}


}
