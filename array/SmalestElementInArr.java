class SmalestElementInArr{

	public static void main(String[] args){
		int[] arr  = {6,3,6,34,6,93,64,43};
		smallElement(arr);
	}
	
	static void smallElement(int[] arr){
		int min = arr[0];
		for(int i=1;i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("The smallElement in an array is:"+min);
	}
}