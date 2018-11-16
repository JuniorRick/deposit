package crdm.deposit.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//TODO
@Table(name = "orders")
public class Release {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reagent_id")
	private Reagent reagent;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")
	private Person person;

	private boolean state;

	private float order_quantity;
	
	@Temporal(TemporalType.DATE)
	private Date handed_date;

	public Release() {
	}

		
	public float getOrder_quantity() {
		return order_quantity;
	}

	public void setOrder_quantity(float order_quantity) {
		this.order_quantity = order_quantity;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Reagent getReagent() {
		return reagent;
	}

	public void setReagent(Reagent reagent) {
		this.reagent = reagent;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Date getHanded_date() {
		return handed_date;
	}

	public void setHanded_date(Date handed_date) {
		this.handed_date = handed_date;
	}

}
