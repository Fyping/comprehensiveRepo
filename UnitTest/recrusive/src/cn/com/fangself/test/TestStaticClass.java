package cn.com.fangself.test;


//��������͸���ľ�̬����飬�Ǿ�̬����顢��̬������ִ��˳������


/**
 * result��
 * Base static block
child class static block 
Base constructor method execute
Class A constructor executed
Base constructor method execute
Class A constructor executed

*����������ģ���û���������е�һ������jvm������static �����֮���Ⱥ��ʼ�����������ľ�̬�����;�̬������֮��ֱ���ʵ�������������Ķ���
*����main�������ٴ�ִ��    new As() ֮��ֻ���ٴ�ʵ�����������࣬��û���ٴγ�ʼ����̬�����;�̬��������˵����̬�����;�̬�������jvm��ֻ��ʼ��һ��
*
*���У����ھ�̬�����;�̬������һ����ִ�е����⣬
*���д����©��
*ͨ�����н�������ɵõ���ȷ�Ľ������һ������������ִ����һ��
 * */
class Base{
    static int a=100;
	static {
    	System.out.println("Base static block");
    }
	public Base(){
		System.out.println("Base constructor method execute");
	}
	static int b = 1000;
	
}
class As extends Base{
	static int c = 100;
	static {
		System.out.println("child class static block ");
	}
	static int d = 1000;
	public As(){
		System.out.println("Class A constructor executed");
	}
	static int e = 100;
}

public class TestStaticClass {
	static{
		new As();
	}
	public static void main(String[] args) {
		new As();
	}
}