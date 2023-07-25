class eg4{
	public static void main(String[] args){
		int a=2, b=3;
		int x=a++ + ++b;
		int y=a-- - --b;
		int z=--a + b--;
		int d=++a - b++;

		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(d);
	}
}