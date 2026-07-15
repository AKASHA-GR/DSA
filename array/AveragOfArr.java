class AveragOfArr{
	public static void main(String[] args){
		int[] arr = {3,73,46,26,39,82,18,62};
		element(arr);
	}
	
	static void element(int[] arr){
		int sum = 0;
		
		for(int i = 0;i < arr.length;i++){
			sum = sum + arr[i];
		}
		
		double average = (double)sum/arr.length;
		
		System.out.println("The Averag Of Array:"+average);
	}
}