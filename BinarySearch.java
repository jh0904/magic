package cn.demo.basis1;

public class BinarySearch {
	//关于二分查找的底层实，调用了递归。需传入一个有序数组
	public static void main(String[] args) {
		
	}
	public static int rank(int key,int[] a){
		return rank(key,a,0,a.length-1);
	}
	public static int rank(int key, int[] a, int lo, int hi) {
		//如果key存在于a[]中，它的索引不会小于lo且不会大于hi。
		if(lo>hi) return -1;
		int mid =lo + (hi-lo)/2;
		if		(key<a[mid]) return rank(key, a, lo, mid-1);
		else if (key>a[mid]) return rank(key, a, mid+1, hi);
		else 				 return mid;
	}
}
