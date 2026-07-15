class SumOfElementInArr{
	public static void main(String[] args){
		int[] arr = {8,73,27,66,18,53,91,36};
		element(arr);
	}
	
	static void element(int[] arr){
		int sum = 0;
		
		for(int i=0;i < arr.length;i++){
			sum = sum + arr[i];
		}
		System.out.println("The sum of all element in an array:"+sum);
	}
}