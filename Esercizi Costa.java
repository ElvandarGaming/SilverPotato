package it.epicode.helloWorld;

import java.util.Scanner;

import java.util.Arrays;

public class Esercizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("scegli la dimensione dell'array");
		Scanner console =new Scanner(System.in);
		int p = console.nextInt();
		System.out.println("dammi "+ p +" numeri");
		
		int[] array = new int[p];	
		
		for (int i=0; i<p; i++) {
			//Scanner console = new Scanner(System.in);
			array[i] = console.nextInt();
		
		}
		//int[] myArray = new int[numElements];
		
		
		
		
		//Scanner console = new Scanner(System.in);
		System.out.println("dammi un numero da analizzare");
		int d = console.nextInt();
		
		/*int[] array	= {4,5,5,5,5,5,6,5,7};
		int d = 5;
		*/
		
		//boolean a =contiene(array, d);
		System.out.println("l'array contiene il numero?  " +contiene(array,d));
		System.out.println("in che prima posizione?  " +primaPosizione(array,d));
		System.out.println("in che ultima posizione?  " +ultimaPosizione(array,d));
		System.out.println("L'intero piu basso dell'array?  " +min(array));
		System.out.println("L'intero piu alto dell'array?  " +max(array));
		System.out.println("in che posizioni?  " +posizioni(array,d));
		//System.out.println(a);
	}
	public static boolean contiene(int[] a , int b) {
			int i =0;
			
		while (i<a.length) {
			boolean check = a[i]==b;
			if(check) {
				return true;
				}
			i++;
		}
		return false;

	}
	
	public static int primaPosizione(int[] a,int b) {
		int e=-1;
		
		for (int i=0; i<a.length; i++) {
			boolean check = a[i]==b;
			if(check) { 
				e = i; 
				i=a.length;
			}
		}
		return e;
	}
	public static int ultimaPosizione(int[] a,int b) {
		int e=-1;
		
		for (int i=0; i<a.length; i++) {
			boolean check = a[i]==b;
			if(check) { 
				e = i; 
			}
		}
		return e;
	}
	public static String posizioni(int[] a,int b) {
		
		int f = 0;
		//System.out.println(f);
		//int e=-1;
		
		for (int i=0; i<a.length; i++) {
			boolean check = a[i]==b;
			if(check) { 
				//h[f] = i; 
				
				f++;
				//i=a.length;
			}
		
		}
		
		int[] h = new int[f];
		f=0;
		//System.out.println(f);
		for (int i=0; i<a.length; i++) {
			boolean check = a[i]==b;
			if(check) { 
				h[f] = i; 
				
				f++;
				//i=a.length;
			}
		
		}
		//System.out.println(Arrays.toString(h));
		return Arrays.toString(h);
		
	}

	public static int min(int[] a) {
		int e = a[0];
		int i = 0;
		while(i<a.length) {
			if (e>a[i]) {
				e=a[i];
			}
			i++;
		}
		return e;
	}
	
	public static int max(int[] a) {
		int e = a[0];
		for(int i=0; i<a.length; i++) {
			if(e<a[i])
				e=a[i];
		}
		return e;
	}

}
