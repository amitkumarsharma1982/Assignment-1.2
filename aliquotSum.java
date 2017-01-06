class PrimeNumberModel{
	
	int unumber,sumResult=0;

	public void captrueInput(){
		
		System.out.print("Enter a positive integer: ");
		unumber = Integer.parseInt(System.console().readLine());
		

	}
	public void primeNumberCheck(){
		int i;
                System.out.println("=====================================");
                System.out.print("the aliquot divisors of "+unumber+" are ");
		for(i=1; i<unumber; i++)
                {
                // If remainder is 0 when 'n' is divided by 'i'
                     
                    if(unumber%i==0)
                         {
                            System.out.print(i+" ");
                            sumResult=sumResult+i;
                        }
                    
                }
                System.out.println("");
                System.out.println("=====================================");
                System.out.println("the aliquot sum of "+unumber+" is :"+sumResult);
	}
	
}
class aliquotSum{
	
	public static void main (String[] args){
            

		System.out.println("This program check whether entered number is prime or not ");
		PrimeNumberModel t1 = new PrimeNumberModel();
		t1.captrueInput();
                t1.primeNumberCheck();
	
	}
}