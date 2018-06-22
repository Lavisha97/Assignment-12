import java.util.*;

class SortByAN
{
	public static void main(String args[])
	{

		ArrayList array=new ArrayList();
		array.add(new Student(101,"Sham",26));
		array.add(new Student(102,"Ram",23));
		array.add(new Student(103,"Hari",25));
		array.add(new Student(104,"Om",21));

		System.out.println("Sorting by Age");
		Collections.sort(array,new Age());
		Iterator itr1=array.iterator();
		while(itr1.hasNext())
		{
			Student st=(Student)itr1.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		
		System.out.println("Sorting by Name");
		Collections.sort(array,new Name());
		Iterator itr=array.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}
}
class Student
{
	int rollno,age;
	String name;

	Student(int rollno , String name, int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class Name implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;

		return s1.name.compareTo(s2.name);
	}
}
class Age implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;

		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
}