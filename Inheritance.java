class A
 {
    int i;
    int j;
    A(int k, int l) 
	{
        i = k;
        j = l;
    }
    void m()
	{
        System.out.println("Java");
		System.out.println("C programming ");
    }
}
class B extends A 
{
    B(int k, int l)
	{
        super(k,l);
        System.out.println("phython");
		System.out.println("Data structures");
    }
}
class Inheritance 
{
    public static void main(String[] args) 
	{
        B b = new B(10000000, 20098868);   
        System.out.println(b.i);
        System.out.println(b.j);   
        b.m();
    }
}