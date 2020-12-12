package java;

public class corejava {

	public corejava() {
		// TODO Auto-generated constructor stub
	
		 int Apple = 50;
		 int Mango = 60;
		 int Pineapple = 100;
		 int Banana = 45;
		 
		 int totalcost = (Apple + Mango + Pineapple + Banana);
		 
		if ( totalcost <= 200 ) {
			System.out.println("Expenshive");
		} else if ( totalcost == 180){
			System.out.println("Normal");
		} else {
			System.out.println("Cheap");
		}
		 
	}

}
