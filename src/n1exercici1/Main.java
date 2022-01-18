package n1exercici1;

public class Main {

	public static void main(String[] args) {
		
		Pare pare = new Pare();
		FillA fillA = new FillA();
		FillB fillB = new FillB();
		NetA netA = new NetA();
		NetB netB = new NetB();
		
		System.out.println("Pare");
		pare.f();
		System.out.println("Fill A");
		fillA.f();
		System.out.println("Fill B");
		fillB.f();
		System.out.println("Net A");
		netA.f();
		System.out.println("Net B");
		netB.f();
		
		System.out.println("Pare");
		pare.g();
		System.out.println("Fill A");
		fillA.g();
		System.out.println("Fill B");
		fillB.g();
		System.out.println("Net A");
		netA.g();
		System.out.println("Net B");
		netB.g();
		
		

	}

}
