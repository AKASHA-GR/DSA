class ReverseArray{
	public static void main(String[] args){
		int[] arr = {23,45,57,86,34,74,39,62,48,29};
		element(arr);
	}
	
	static void element(int[] arr){
		System.out.print("The reverced array:");
		for(int i = arr.length -1; i>= 0; i--){
			System.out.print(arr[i]+" ");
		}
	}
}