package es.dicotraining.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person")
public class Person {

	private Long id;
	private String firsname;
	private String lastname;
	private Double money;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirsname() {
		return firsname;
	}
	public void setFirsname(String firsname) {
		this.firsname = firsname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", FirsName=" + firsname + ", lastname=" + lastname + ", money=" + money + "]";
	}
	
	
	
	
}
