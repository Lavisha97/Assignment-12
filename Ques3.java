import java.util.*;

class Printing
{
  public static <E> void printArray(E[] inputArray , int n)
  {
	ArrayList<E> Arr=new ArrayList<E>();
	
    for (int i = 0 ; i < n ; i++)
	{
		Arr.add(inputArray[i]);
	}
	System.out.println(Arr);
  }

  public static void main(String args[]) 
  {
	int n;
	System.out.println("Enter an option");
	System.out.println("1. Integer");
	System.out.println("2. Double");
	System.out.println("3. Character");
	System.out.println("4. Float");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	
	if(n == 1)
	{
		Integer[] IntegerArray = {1,2,3,4,6,5,8,4,6,2,7,9,4};
		int ia=IntegerArray.length;
		System.out.println("IntegerArray contains:");
		printArray(IntegerArray,ia);
	}
	
	else if(n==2)
	{
		Double[] DoubleArray = {1.47,3.97,8.32,9.56,7.94,2.66,4.59,4.26};
		int da=DoubleArray.length;
		System.out.println("DoubleArray contains:");
		printArray(DoubleArray,da);
	}
	
	else if(n==3)
	{
		Character[] CharacterArray = {'a','b','e','t','W','Y','c','r'};
		int ca=CharacterArray.length;
		System.out.println("CharacterArray contains:");
		printArray(CharacterArray,ca);
	}
	else if(n==4)
	{
		Float[] FloatArray = {2.6f,1.5f,7.5f,3.5f,2.9f,5.7f,9.6f,3.9f};
		int fa=FloatArray.length;
		System.out.println("FloatArray contains:");
		printArray(FloatArray,fa);
	}
	else
	{
		System.out.println("Invalid Input");
	}
  }
}