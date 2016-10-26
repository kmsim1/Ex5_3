
public class MainApp {
	public static void main(String []args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		Robot sunguard = new SunGuard("SunGuard");
		
		
		
		
		System.out.println("Myname is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		System.out.println();
		
		System.out.println("Myname is " + atom.getName());
		atom.move();
		atom.attack();
		System.out.println();
		
		System.out.println("Myname is " + sunguard.getName());
		sunguard.move();
		sunguard.attack();
	}
}
