/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Mother m=new Mother(); 
		System.out.println(m.show()); //output - Hello World
		Child ch=new Child();
		System.out.println(ch.show()); //output - Hello JUET!
		System.out.println(ch.show()); //output - Hello JUET!
	}
}