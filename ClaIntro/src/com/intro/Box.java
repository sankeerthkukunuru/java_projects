package com.intro;

public class Box {
	
	int height;
	int width;
	int length;
	
	Box(int h, int w, int l){
		height=h;
		width =w;
		length =l;
				
	}
	Box(Box ob){
		height=ob.height;
		width =ob.width;
		length =ob.length;
				
	}
	Box(){
		height=1;
		width =1;
		length =1;
	}

}
