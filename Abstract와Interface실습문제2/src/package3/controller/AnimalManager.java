package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[5];
		
		ani[0] = new Dog("뽀삐","강아지",10);
		ani[1] = new Dog("깜찍","강아지",20);
		ani[2] = new Cat("냥냥이","고양이","신림","빨간색");
		ani[3] = new Cat("뇽냥이","고양이","홍대","초록색");
		ani[4] = new Dog("큐티","강아지",10);
		
		
		
		for(int i=0; i<ani.length; i++){
			if(ani[i] instanceof Dog) {
				((Dog)ani[i]).speak();
			}else if(ani[i] instanceof Cat) {
				((Cat)ani[i]).speak();
			}
		}
		
	}

}
