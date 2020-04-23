package com.intro;

public class BoxDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Box mb =new Box();
		Box pmb= new Box(3, 4, 5);
		
		Box mb1= mb;
		mb=null;
		
		Box copyBox =new Box(pmb);
		System.out.println(mb1.height);
		System.out.println(pmb.height);
		System.out.println(copyBox.height);
      
	}

}
