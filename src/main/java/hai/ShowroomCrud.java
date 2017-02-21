package hai;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class ShowroomCrud {
	public void add(Session session)
	{
		
		Showroom showroom = new Showroom();
		  showroom.setLocation("East Croydon, Greater London");
		  showroom.setManager("Barry Larry");

		  // Define our cars - note their type
		  List<Car> cars = new ArrayList<Car>();
		  cars.add(new Car("Toyota", "Racing Green"));
		  cars.add(new Car("Toyota", "Racing Green"));
		  cars.add(new Car("Nissan", "White"));
		  cars.add(new Car("BMW", "Black"));
		  cars.add(new Car("Mercedes", "Silver"));

		  // Attach them to the showroom and persist
		  showroom.setCars(cars);
		  session.save(showroom);
	}
}
