package cn.com.fangself.test;

class Class_1{
	static{
		System.out.println("This class class_1 was loaded");
	}
	public Class_1(){
		System.out.println("this class class_1 was created");
	}
	
}
class Class_2{
	static {
		System.out.println("this class ckass_2 was loaded");
	}
	public Class_2(){
		System.out.println("this class class_2 was created");
	}
}
class Class_3{
	static {
		System.out.println("This class class_3  was loaded");
	}
}
public class ClassLoaderTest {

	public static void main(String args[]){
		new Class_1();
		try {
			Class.forName("cn.com.fangself.test.Class_2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		/**The result is :
		 *  This class class_1 was loaded
		 *	this class class_1 was created
		 *	this class ckass_2 was loaded

		 * */
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		System.out.println("This class ClassLoaderTest is " + classLoader);
		System.out.println("this class classLoaderTest ParentClass is " + classLoader.getParent());
		System.out.println("The root classLoader is " + classLoader.getParent().getParent());
		System.out.println();
	}
}