package lab2;

//import java.util.Arrays;
import java.util.Scanner;

public class exercise3 {
	
	public static int getSorted(int[] a) {
		String[] c = new String[a.length];
		for(int i=0; i<a.length; i++) {
			   
		}
		for(String ch : c) {
			System.out.println(ch);
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSorted(arr));

	}

}
