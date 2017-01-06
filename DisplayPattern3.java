class PaternModel{
	
	int usernumber;

	public void captrueInput(){
		
		System.out.print("Please enter a number :");
		usernumber = Integer.parseInt(System.console().readLine());
		

	}
	public void processResult(){
		
		for (int i=1 ; i<=usernumber ; i++)	{
                    for (int j=i ; j>0 ; j--){
                    System.out.print(j);
                    }
                    System.out.println("");
                }
	}
	
}
class DisplayPattern3{
	
	public static void main (String[] args){

		System.out.println("This accepts a number as argument and print the pattern");
		PaternModel t1 = new PaternModel();
                t1.captrueInput();
		t1.processResult();		
	
	}
}