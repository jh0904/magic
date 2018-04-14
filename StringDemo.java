package cn.test.test;
/*结果：
		hello--s--world
		s1-------->world
		hello--s--world
		hello--sb--world
		sb1------->world
		hello--sb--worldworld
	结论：基本类型：形式参数的改变不会影响实际参数。
		引用类型：形式参数的改变会影响实际参数。
	注意：String作为参数传递，效果和基本类型传递参数是一样的。
*/
public class StringDemo {
	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		System.out.println(s1+ "--s--"+ s2);
		change(s1,s2);
		System.out.println(s1+ "--s--"+ s2);
		
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("world");
		System.out.println(sb1+ "--sb--"+ sb2);
		change(sb1,sb2);
		System.out.println(sb1+ "--sb--"+ sb2);
	}

	public  static void change(StringBuffer sb1, StringBuffer sb2) {
			sb1=sb2;
			System.out.println("sb1------->"+sb1);
			sb2.append(sb1);
	}

	public static void change(String s1, String s2) {
		s1=s2;
		System.out.println("s1-------->"+s1);
		s2+=s1;
	}

}
