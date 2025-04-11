/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Test
{
	public static void main(String[] args) {
		Offering o = new Coffee();
		o = new Rum(o);
		o = new Rum(o);
		System.out.println(o.getName()+" "+o.getPrice());
	}
}