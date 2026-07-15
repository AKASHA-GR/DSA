class SearchElementInArr{
	public static void main(String[] args){
		int[] arr = {14,24,53,82,10,48,29,76,93,37,39,50};
		int target = 50;
		if(search(target,arr)){
			System.out.println("The Element is found in an Array.");
		}else{
			System.out.println("The Element is not found in an Array.");
		}
		
	}
	
	static boolean search(int target,int[] arr){
		System.out.println("Search the Element:"+target);
		
		
		for(int i=0;i <= arr.length;i++){
			if(arr[i] == target){
				return true;
			}
		}
	    return false;
	}
}