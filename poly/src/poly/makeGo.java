package poly;

public class makeGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Draw x = new Circle();

Draw c = new notCircle();
Line l = new Line();
x.doDrawing(x);
doMath(x,6,6);
System.out.println("");
c.doDrawing(c);
doMath(c,6,6);
System.out.println("");
c.doDrawing(l);
doMath(l,6,6);

notCircle nC = (notCircle) c;
nC.notCircleMethod();
	}
	public static void doMath(Draw d, int a, int b){
		d.add(a, b);
	}

}
