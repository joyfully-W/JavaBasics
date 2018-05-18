

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *	string => Date 字符串转日期
 *	Date => string 日期转字符串
 */

public class Datedemo{
	public static void main(String[] args) throws Exception {
			function();
			function1();
	}
	
	/*
	 * 	将字符串转换为日期对象 
	 *	Date parse（string s）
	 *	步骤：
	 *	1.创建simpleDateformat对象
	 *		构建方法中指定日期模式
	 *	2.子类对象，调用方法parse，传递string 转化为date
	 */
	public static void function1() throws Exception {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse("1996-01-01 12:54:00");
		System.out.println(date);
	}
	
	/*
	 * 对日期格式化
	 * 步骤：
	 * 	1.创建simpleDateformat对象
	 * 在类构造方法中，写入字符串的日期格式（自己定义）
	 * 2.simpleDateformat调用方法format对日期进行格式化
	 * 	string format(Date date) 传递日期对象，返回字符串
	 *日期模式：
	 *	yyyy 年份
	 *	MM  月份
	 *	dd 月中的天数
	 *	HH	0-23小时
	 *	mm	小时中的分钟数
	 *	ss  秒
	 */
	public static void function() {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String date =sdf.format(new Date());
		System.out.println(date);
	}
}
