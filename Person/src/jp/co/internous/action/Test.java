package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="aaaa@gmail.com";
		

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();

		Person kmr=new Person();
		kmr.name="木村次郎";
		kmr.age=18;
		kmr.phoneNumber="111-1111-1111";
		kmr.address="iiii@gmail.com";
		
		System.out.println(kmr.name);
		System.out.println(kmr.age);
		System.out.println(kmr.phoneNumber);
		System.out.println(kmr.address);
		kmr.walk();

		

		Person hnk=new Person();
		hnk.name="鈴木花子";
		hnk.age=16;
		hnk.phoneNumber="222-2222-2222";
		hnk.address="uuuu@gmail.com";
		
		
		System.out.println(hnk.name);
		System.out.println(hnk.age);
		System.out.println(hnk.phoneNumber);
		System.out.println(hnk.address);
		hnk.run();
		
		Person ng=new Person();
		ng.name="長沢空";
		ng.age=19;
		ng.phoneNumber="333-3333-3333";
		ng.address="eeee@gmail.com";
		
		System.out.println(ng.name);
		System.out.println(ng.age);
		System.out.println(ng.phoneNumber);
		System.out.println(ng.address);
		
		Robot ai=new Robot();
		ai.name="aibo";
		
		ai.talk();
		
		Robot asi=new Robot();
		asi.name="asimo";
		
		asi.walk();
		
		Robot pep=new Robot();
		pep.name="pepper";
		
		pep.run();
	}

}
