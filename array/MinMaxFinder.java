class MinMaxFinder {
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50,60};
		found(arr);
	}
	
	static void found(int[] arr){
		int min = arr[0];
		int max = arr[0];
		
		if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

		
		for(int i=0;i < arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}else if(arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println("The maximum value in Array:"+max);
		System.out.println("The minimum value in Array:"+min);
	}
}