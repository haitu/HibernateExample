package hai;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Cars")
public class Car {

	@Id @GeneratedValue
	@Column(name = "car_id")
	private int id;

	public Car()
	{
		
	}
	public Car(String name,String color)
	{
		this.name = name;
		this.color = color;
	}
	
	@Column(name = "name")
	private String name = null;

	@Column(name = "color")
	private String color = null;

	@ManyToOne
	 @JoinColumn(name = "showroom_id")
	private Showroom showroom;  
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
