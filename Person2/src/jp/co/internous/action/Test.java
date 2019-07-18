package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		
		Person taro= new Person();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person jiro =new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person sab =new Person("saburo",0);
		System.out.println(sab.name);
		System.out.println(sab.age);
		
		Person un =new Person("名前なし",25);
		System.out.println(un.name);
		System.out.println(un.age);
		
		Person hnk =new Person("hanako",17);
		System.out.println(hnk.name);
		System.out.println(hnk.age);
	}

}
