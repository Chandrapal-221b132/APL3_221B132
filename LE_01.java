/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Juet{
    String name;
    int age;
    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
}
public class Main
{
	public static void main(String[] args) {
		Juet j = new Juet();
		j.setAge(21);
		j.setName("Chandrapal Singh");
		System.out.println("Name = "+j.getName());
		System.out.println("Age = "+j.getAge());
	}
}