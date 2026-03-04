class LeapYear{
	public static void main(String[] args){
		solution(2000);
	}
	
	static void solution(int n){
		System.out.println("value:"+n);
			//Scanner sc = new Scanner(System.in);
			//int n = sc.parsenextInt();
			
			if((n%100 == 0) && (n%4 == 0)){
				System.out.println("Enterd value is leap Year.");
			} else {
				System.out.println("Enterd value is Not leap Year.");
			}
	    }
    
}