//Program to find Reverse of a String 

class ReverseString{
	public static void main(String[] args){
		String str = "Akasha";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--){
			rev = rev + str.charAt(i);
		}
		
		System.out.println("The Befor reversing String."+str);
		System.out.println("The After reversing String."+rev);
	}
}

//Program to find armstrong number 
//Program to sort array elements in desc order 
//Program to sort array elements in asc order 
//Program to find an element in array