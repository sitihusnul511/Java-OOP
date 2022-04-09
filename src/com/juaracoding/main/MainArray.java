package com.juaracoding.main;

public class MainArray extends Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int angka[] = {33, 22, 11, 44};
		
		MainArray myArray = new MainArray();
		myArray.tampilkan(angka);
		System.out.println("-------");
		myArray.bubbleSort(angka);
		myArray.tampilkan(angka);

	}
	
}



 class Sorting {
	
	void tampilkan (int angka[]) {
		for (int i=0; i<angka.length; i++) {
			System.out.println(angka[i]);
		}
	}
	
	void bubbleSort (int angka[]) {
		int temp;
		for (int i=0; i<angka.length; i++) {
			for (int j=i+1; j<angka.length; j++) {
				if (angka [j]<angka[i]) {
					temp = angka[i];
					angka[i] = angka[j];
					angka[j] = temp;
				}
			}
		}
	
}
 }