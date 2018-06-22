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
	System.out.println("4. String");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	
	if(n == 1)
	{
		Integer[] IntegerArray = {1,2,3,4,6,5,8,4,6,2,7,9,4};
		int ia=IntegerArray.length;
		System.out.println("Array IntegerArray contains:");
		printArray(IntegerArray,ia);
	}
	
	else if(n==2)
	{
		Double[] DoubleArray = {1.4,3.7,8.3,9.6,7.4,2.6,4.5,4.6};
		int da=DoubleArray.length;
		System.out.println("\nArray DoubleArray contains:");
		printArray(DoubleArray,da);
	}
	
	else if(n==3)
	{
		Character[] CharacterArray = {'a','b','e','t','W','Y','c','r'};
		int ca=CharacterArray.length;
		System.out.println("\nArray CharacterArray contains:");
		printArray(CharacterArray,ca);
	}
	else if(n==4)
	{
		String[] StringArray = {"apple","bat","fan","Ant","Eye","Axe","dog"};
		int sa=StringArray.length;
		System.out.println("\nArray StringArray contains:");
		printArray(StringArray,sa);
	}
	else
	{
		System.out.println("Invalid Input");
	}
  }
}