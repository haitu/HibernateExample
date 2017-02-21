package hai;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "showrooms")
public class Showroom {
	
	@Id @GeneratedValue
	@Column(name = "showroom_id")
	private int id = 0;
	
	@Column(name = "manager")
	private String manager = null;
	
	@Column(name = "location")
	private String location = null;
	
//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="showroom_id")
	
	@OneToMany(cascade=CascadeType.ALL)
	  @JoinColumn(name="SHOWROOM_ID")

	private List<Car> cars;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getManager() {
		return manager;
	}


	public void setManager(String manager) {
		this.manager = manager;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}



}
