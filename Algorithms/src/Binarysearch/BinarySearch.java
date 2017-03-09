package Binarysearch;

import java.util.Arrays;

import stdlibraries.In;
import stdlibraries.StdIn;

public class BinarySearch {
	
	public static int rank(int key, int[] a){
		
		int hi = a.length -1;
		int lo = 0;
		
		while(lo <= hi){
			int mid = lo + (hi - lo)/2;
			if(key < a[mid]){
				hi = mid - 1;
			}else if(key > a[mid]){
				lo = mid + 1;
			}else return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);
		
		Arrays.sort(whitelist);
		
		while (!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if(rank(key,whitelist)<0){
				System.out.println(key);
			}
			
		}

	}

}
