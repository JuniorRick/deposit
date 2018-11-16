package crdm.deposit.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "reagents")
public class Reagent {

	public Reagent() {
	}
	

	public Reagent(String name, Date receive_date, String code, String lot, String ref, String quantity, Date expire,
			boolean handed) {
		this.name = name;
		this.receive_date = receive_date;
		this.code = code;
		this.lot = lot;
		this.ref = ref;
		this.quantity = quantity;
		this.expire = expire;
		this.handed = handed;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "producer_id")
	private Producer producer;

	private Date receive_date;

	private String code;

	private String lot;

	private String ref;

	private String quantity;

	private Date expire;

	@ColumnDefault("0")
	@Column(name = "is_handed")
	private boolean handed;

	private Date created_at;

	private Date updated_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getReceive_date() {
		return receive_date;
	}

	public void setReceive_date(Date receive_date) {
		this.receive_date = receive_date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Date getExpire() {
		return expire;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	public boolean isHanded() {
		return handed;
	}

	public void setHanded(boolean handed) {
		this.handed = handed;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Reagent [name=" + name + ", producer=" + producer + ", receive_date=" + receive_date + ", code=" + code
				+ ", lot=" + lot + ", ref=" + ref + ", quantity=" + quantity + ", expire=" + expire + ", handed="
				+ handed + "]";
	}

	
	
}
