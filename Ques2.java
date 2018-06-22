import java.util.*;

class Sort
{

	public static <E> ArrayList sorter(E[] inputArray , int n)
	{

		ArrayList<E> Arr=new ArrayList<E>();
		for (int i = 0 ; i < n ; i++)
		{
			Arr.add(inputArray[i]);
		}
		return Arr;
	}

	public static void main(String[] args) 
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
			Integer[] integerArray = {1,2,3,4,6,5,8,4,6,2,7,9,4};
			int ia=integerArray.length;
			List<Integer> arl = new ArrayList<Integer>();
			arl = sorter(integerArray,ia);
			Collections.sort(arl);
			System.out.println("Array IntegerArray contains:");
			System.out.println(arl);
		}
		
		else if(n == 2)
		{
			Double[] DoubleArray = {1.4,3.7,8.3,9.6,7.4,2.6,4.5,4.6};
			int da=DoubleArray.length;
			List<Double> arr = new ArrayList<Double>();
			arr = sorter(DoubleArray,da);
			Collections.sort(arr);
			System.out.println("\nArray DoubleArray contains:");
			System.out.println(arr);
		}
		
		else if(n == 3)
		{
			Character[] CharacterArray = {'a','b','e','t','W','Y','c','r'};
			int ca = CharacterArray.length;
			List<Character> arr1 = new ArrayList<Character>();
			arr1 = sorter(CharacterArray,ca);
			Collections.sort(arr1);
			System.out.println("\nArray CharacterArray contains:");
			System.out.println(arr1);
		}
		
		else if(n == 4)
		{
			String[] StringArray = {"apple","bat","fan","Ant","Eye","Axe","dog"};
			int sa=StringArray.length;
			List<String> ar = new ArrayList<String>();
			ar = sorter(StringArray,sa);
			Collections.sort(ar);
			System.out.println("\nArray StringArray contains:");
			System.out.println(ar);
		}
		
		else
		{
			System.out.println("Invalid Input");
		}
	}

}