package patterns;

public class MakeGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test restricted number factory, forth one will fail
restrictNumberFactory a = restrictNumberFactory.create();
restrictNumberFactory b = restrictNumberFactory.create();
restrictNumberFactory c = restrictNumberFactory.create();
restrictNumberFactory d = restrictNumberFactory.create();
a.doStuff();
b.doStuff();
c.doStuff();
//d.doStuff();//this line causes error because factory d doesn't exist.
//test singleton, both sa and sb share the variable a, so changing one changes both.
Singleton sa = Singleton.create();
Singleton sb = Singleton.create();
sa.a=7;
System.out.println(sb.a);
basicFctory[] factoryArray = new basicFctory[10];
//below, making use of factory to fill an array with factory objects
//this is a useful technique because we don't have to specify the name of the reference variable that holds them.
for(int ab=0;ab<10;ab++){
	factoryArray[ab]=basicFctory.create();
}
for(int ab=0;ab<10;ab++){
	
System.out.println(factoryArray[ab].name);
}

restrictNumberFactory2 a1 = restrictNumberFactory2.create();
restrictNumberFactory2 b2 = restrictNumberFactory2.create();
restrictNumberFactory2 c3 = restrictNumberFactory2.create();
restrictNumberFactory2 d4 = restrictNumberFactory2.create();
a1.doStuff();
b2.doStuff();
c3.doStuff();
d4.doStuff();
	}

}
