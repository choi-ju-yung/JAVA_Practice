package com.bs.example.practice2.run;

import com.bs.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pro = new Product();
		
		pro.setPname("지갑");
		pro.setPrice(500000);
		pro.setBrand("구찌");
		pro.information();
	}

}
