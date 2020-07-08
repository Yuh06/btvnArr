package bt_ls3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class chenpt {
	public static void main(String[] args) {
		insertArray();
		deleteArray();
}
	public static void insertArray() {
		int[] arr={90,90,20,27,35,22,10,8,8};
		int k = 2;
		int number = 100;
		int[] insertArr = new int[arr.length+1];
		for(int i = 0 ; i< arr.length ; i++)
		{
			insertArr[i] = arr[i];
		}
		for ( int j = insertArr.length-1 ; j>k ; j--)
		{
			insertArr[j] = insertArr[j-1];
		}
		insertArr[k] = number;
		
		System.out.println("Output : "+Arrays.toString(insertArr));
	}
	public static void deleteArray() {
		int[] arr={90,90,20,27,35,22,10,8,8};
		
	}
	}