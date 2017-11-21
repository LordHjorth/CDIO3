package junior_matador;

public class Bil {

	public static void setCarFalse() {
		Platform.fields[Spil.getFelt()].setCar(Spiller.getSpiller(Spil.getRunde()), false);
	}
	
	public static void setCarTrue() {
		Platform.fields[Spil.getFelt()].setCar(Spiller.getSpiller(Spil.getRunde()), true);
	}
}
