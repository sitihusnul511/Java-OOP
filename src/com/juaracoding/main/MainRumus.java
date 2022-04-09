package com.juaracoding.main;

import java.util.Scanner;

public class MainRumus extends Rumus{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(penjumlahan(a,b));
		
		String nama = scan.next();
		String alamat = scan.next();
		
		//create object
		MainRumus rumus = new MainRumus();
		rumus.inputData(nama, alamat);
		
		rumus.tampilkanData();
		
		

	}
	
	static int penjumlahan (int a, int b) {
		return a+b;
	}

}

class Rumus {
	
	String nama1, alamat1;
	
	void inputData (String nama, String alamat) {
		nama1 = nama;
		alamat1 = alamat;
	}
	
	void tampilkanData () {
		System.out.println("Nama: "+nama1);
		System.out.println("Alamat: "+alamat1);
	}
}
