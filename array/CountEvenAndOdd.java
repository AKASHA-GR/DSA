class CountEvenAndOdd{
	public static void main(String[] args){
		int[] arr = {67,39,58,28,28,29,73,65,61,57,19,15,21};
		element(arr);
	}

	static void element(int[] arr){
		int countOdd = 0;
		int countEven = 0;
		
		for(int i = 0;i < arr.length; i++){
			if(arr[i] % 2 == 0){
				countEven++;
			}else{
				countOdd++;
			}
		}
		System.out.println("The number of even elements:" + countEven);
		System.out.println("The number of odd elements:" + countOdd);
	}

}