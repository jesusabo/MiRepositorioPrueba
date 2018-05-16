package es.jesus.pruebas;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;


@Controller
public class MiPagina {
	
	private static final String URL_API_BOOKS ="http://private-114e-booksapi.apiary-mock.com/books/";
	
	public static void main(String[] args) {
	    RestTemplate restTemplate = new RestTemplate();
	 
	    ResponseEntity<Book[]> response =
	            restTemplate.getForEntity(URL_API_BOOKS, Book[].class);
	 
	System.out.println();
	System.out.println("GET All StatusCode = " + response.getStatusCode());
	System.out.println("GET All Headers = " + response.getHeaders());
	System.out.println("GET Body (object list): ");
	    
	}
	

}
