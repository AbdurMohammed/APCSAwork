
public class BalloonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balloon mylar = new Balloon();
		
		System.out.println("Initial:");
		System.out.println("Balloon Volume: "+mylar.getVolume());
		System.out.println("Balloon Surface Area: "+ mylar.getSurfaceArea());
		System.out.println("Balloon Radius: "+ mylar.getRadius());
				
		mylar.addAir(100);
		System.out.println("After adding initial first 100 cm^3:");
		System.out.println("Balloon Volume: "+mylar.getVolume());
		System.out.println("Balloon Surface Area: "+ mylar.getSurfaceArea());
		System.out.println("Balloon Radius: "+ mylar.getRadius());
		
		mylar.addAir(100);
		System.out.println("After adding another 100 cm^3:");
		System.out.println("Balloon Volume: "+mylar.getVolume());
		System.out.println("Balloon Surface Area: "+ mylar.getSurfaceArea());
		System.out.println("Balloon Radius: "+ mylar.getRadius());
	}

}
