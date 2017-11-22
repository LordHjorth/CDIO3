package junior_matador;

import java.awt.Color;

import gui_fields.GUI_Car;

public class Bil {

	public static void setCarFalse() {
		Platform.fields[Spil.getFelt()].setCar(Spiller.getSpiller(Spil.getRunde()), false);
	}
	
	public static void setCarTrue() {
		Platform.fields[Spil.getFelt()].setCar(Spiller.getSpiller(Spil.getRunde()), true);
	}
	
	public static GUI_Car setBil() {
		GUI_Car car = new GUI_Car();
		String farve = Spiller.gui.getUserSelection("Farven på din bil", "Sort","Blå", "Gul", "Rød", "Grøn", "Pink");
		if (farve == "Sort") {
			car.setPrimaryColor(Color.BLACK);
		}
		if (farve == "Blå") {
			car.setPrimaryColor(Color.blue);
		}
		if (farve == "Gul") {
			car.setPrimaryColor(Color.yellow);
		}
		if (farve == "Rød") {
			car.setPrimaryColor(Color.red);
		}
		if (farve == "Grøn") {
			car.setPrimaryColor(Color.green);
		}
		if (farve == "Pink") {
			car.setPrimaryColor(Color.MAGENTA);
		}
		return car;
		
	}
}
