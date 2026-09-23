class Counter {
    static int count = 0; 
    int id;

    Counter() {
        count++;
        id = count;
    }

    static void showCount() {
        
        System.out.println("Total objects: " + count);
    }
}
public class static {
	public static void main{
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter.showCount(); 
		}
}