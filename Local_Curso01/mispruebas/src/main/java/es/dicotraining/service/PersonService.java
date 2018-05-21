package es.dicotraining.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import es.dicotraining.domain.Person;

@Service("personService")
public class PersonService {
	
	protected static Logger logger = Logger.getLogger("service");
	
	private List<Person> persons = new ArrayList<Person>();
	
	public PersonService(){
		
		logger.debug("iniciando DB");
		
		Person person1 = new Person();
		person1.setId(0L);
		person1.setFirsname("Jesus");
		person1.setLastname("Bringas");
		person1.setMoney(1000.0);
		
		Person person2 = new Person();
		person2.setId(1L);
		person2.setFirsname("Martin");
		person2.setLastname("Perez");
		person2.setMoney(2000.0);
		
		Person person3 = new Person();
		person3.setId(2L);
		person3.setFirsname("Julia");
		person3.setLastname("Ramirez");
		person3.setMoney(3000.0);


		Person person4 = new Person();
		person4.setId(3L);
		person4.setFirsname("Martha");
		person4.setLastname("Sobrino");
		person4.setMoney(4000.0);
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		
		
	}

	
	public List<Person> getAll(){
		logger.debug("Recuperar todos las personas");
		return persons;
	}
	
	public Person get(Long id){		
		System.out.println("Entro Servive Get");
		
//		for(int i=0 ; i< persons.size(); i++){
//			 persons.get(i).getFirsname();
//		}
		
		logger.debug("Recuperar person con id: " + id);
		for(Person person: persons){
			if(person.getId().longValue()==id.longValue()){
				logger.debug("valor encontrado");
				return person;
			}
		}
		logger.debug("no hay registros encontrados");
		return null;
	}
	
	
	public Person editar(Person persona){
		
		try {
			for(Person p : persons){
				if(p.getId().longValue()==persona.getId().longValue()){
					persons.remove(p);
					persons.add(persona);
					return p;				
				}				
			}
		
		} catch (Exception e) {
			return persona;
		}	
		return persona;
	}
	
	
}
