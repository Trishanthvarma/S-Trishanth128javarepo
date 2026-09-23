interface Animal
{
	void eat();
	void bark();
}
class dog implements Animal
{
	public void eat()
	{
	System.out.println("Dog is eating");
	}
	public void bark()
	{
		System.out.println("Dog is barking");
	}
}
class cat implements Animal
{
	public void bark()
	{
		System.out.println("Cat is barking");
	}
	public void eat()
	{
		System.out.println("Cat is eating");
	}
}
	class Interface
	{
		public static void main(String[]args)
		{
			Animal a= new dog();
			a.eat();
			a.bark();
			Animal b= new cat();
			b.bark();
			b.eat();
		}
	}