class PrimeNumberModel{
	
	int unumber;

	public void captrueInput(){
		
		System.out.print("Enter a positive integer: ");
		unumber = Integer.parseInt(System.console().readLine());
		

	}
	public void primeNumberCheck(){
		int i,flag=0;
		for(i=2; i<=unumber/2; ++i)
                {
                // condition for nonprime number
                    if(unumber%i==0)
                         {
                            flag=1;
                            break;
                        }
                }

                if (flag==0)
                     System.out.println(unumber+" : is a prime number.");
                else
                System.out.println(unumber+" : is not a prime number.");
    

	}
	
}
class PrimeNumber{
	
	public static void main (String[] args){

		System.out.println("This program check whether entered number is prime or not ");
		PrimeNumberModel t1 = new PrimeNumberModel();
		t1.captrueInput();
                t1.primeNumberCheck();
	
	}
}