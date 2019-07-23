package jp.co.RPG;

public class Human {

	private String name = null; //名前
	private int gender = 0 ;//性別(1男、2女）
	private int length = 0 ;//身長
	private int weight = 0 ; //体重
	private int vitality = 0 ; //体力
	private int magic = 0 ; //魔力

	//コンストラクタ
	public Human(){
	}

	//getter.setter(名前)
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	//getter.setter(性別)
	public int getGender(){
		return gender;
	}
	public void setGender(int gender){
		this.gender = gender ;
	}

	//getter.setter(身長)
	public int getLength(){
		return length;
	}
	public void setLength(int length){
		this.length=length;
	}

	//getter.setter(体重)
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight=weight;
	}

	//getter.setter(体力)
	public int getVitality(){
		return vitality;
	}
	public void setVitality(int vitality){
		this.vitality= vitality;
	}

	//getter.setter(魔力)
	public int getMagic(){
		return magic;
	}
	public void setMagic(int magic){
		this.magic = magic;
	}

	//はなす
	public void talk(String about){
		System.out.println(about);
	}

	//たべる
	public void eatFood(String food){

		int foodType = 0;
		if(food == "やくそう"){
			foodType = 1;
		}else if (food == "まほうのみず"){
				foodType = 2;
			}else{
				foodType = 3;
			}
			digestFood(foodType);  //消化
		}

	//消化する
	private void digestFood(int foodType){
		if(foodType ==1){
			vitality +=10;
		}else if(foodType == 2){
			magic += 10;
		}else{
			vitality +=1;
		}
	}
}