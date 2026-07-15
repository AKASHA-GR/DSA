class CountPositiveNegative{
	public static void main(String[] args){
		int[] arr = {-3,0,-2,-15,-1,0,83,20,76,44,38};
		count(arr);
	}
	
	static void count(int[] arr){
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		
		for(int i=0;i < arr.length;i++){
			if(arr[i] == 0){
				countZero++;
			}else if(arr[i] > 0){
				countPositive++;
			}else{
				countNegative++;
			}
		}
		
		System.out.println("The number of positive elements:"+countPositive);
		System.out.println("The number of negative elements:"+countNegative);
		System.out.println("The number of Zero:"+countZero);
	}

}