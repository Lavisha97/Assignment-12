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
		System.out.println("4. Float");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n == 1)
		{
			Integer[] integerArray = {1,2,3,4,6,5,8,4,6,2,7,9,4};
			int ia=integerArray.length;
			List<Integer> arl = new ArrayList<Integer>();
			arl = sorter(integerArray,ia);
			Collections.sort(arl);
			System.out.println("IntegerArray contains:");
			System.out.println(arl);
		}
		
		else if(n == 2)
		{
			Double[] DoubleArray = {1.47,3.97,8.32,9.56,7.94,2.66,4.59,4.26};
			int da=DoubleArray.length;
			List<Double> arr = new ArrayList<Double>();
			arr = sorter(DoubleArray,da);
			Collections.sort(arr);
			System.out.println("DoubleArray contains:");
			System.out.println(arr);
		}
		
		else if(n == 3)
		{
			Character[] CharacterArray = {'a','b','e','t','W','Y','c','r'};
			int ca = CharacterArray.length;
			List<Character> arr1 = new ArrayList<Character>();
			arr1 = sorter(CharacterArray,ca);
			Collections.sort(arr1);
			System.out.println("CharacterArray contains:");
			System.out.println(arr1);
		}
		
		else if(n == 4)
		{
			Float[] FloatArray = {2.6f,1.5f,7.5f,3.5f,2.9f,5.7f,9.6f,3.9f};
			int fa=FloatArray.length;
			List<Float> ar = new ArrayList<Float>();
			ar = sorter(FloatArray,fa);
			Collections.sort(ar);
			System.out.println("FloatArray contains:");
			System.out.println(ar);
		}
		
		else
		{
			System.out.println("Invalid Input");
		}
	}

}