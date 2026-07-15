class LargestElementInArr{
	public static void main(String[] args){
		int[] arr = {4,7,23,74,92,74,53,10};
		element(arr);
	}
	
	static void element(int[] arr){
		int max = arr[0];
		for(int i=1;i <arr.length;i++){
			
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("The largest element in an array is:"+max);
	}
}