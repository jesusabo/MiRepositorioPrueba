package es.dicotraining.rest;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


import es.dicotraining.weather.domains.Country;
import es.dicotraining.weather.places.Forecast;
import es.dicotraining.weather.places.Places;
import es.dicotraining.weather.places.Query;
import es.dicotraining.weather.tiempo.Tiempo;
import es.dicotraining.weather.weather.Weather;



@Controller
public class HomeController {
	
	
	
	private static final String PLACES_SUFIX = "%2C%20ak%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
	private static final String PLACES_PREFIX = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private static final String WEATHER_SUFFIX = "%22&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";
	private static final String WEATHER_PREFIX = "https://query.yahooapis.com/v1/public/yql?q=SELECT%20*%20FROM%20weather.forecast%20WHERE%20woeid%3D%22";
	
	@RequestMapping(value="/inicio", method= RequestMethod.GET)		
	public String home(Locale locale, Model model) {	
	model.addAttribute("country", new Country());
		return "inicio";		
	}
	
	@RequestMapping("/pagina2")
	public String pagina2()
	{
		System.out.println("pagina2");
		return "result";
	}
	
	@RequestMapping(value="/inicio" , method=RequestMethod.POST)
	public String home(@ModelAttribute Country country, Model model ) throws RestClientException,URISyntaxException {
		System.out.println("entro");
		RestTemplate restTemplate = new RestTemplate();
		//el fichero json debe convertirlo a Places.class
		
		Places places = restTemplate.getForObject(new URI(PLACES_PREFIX+country.getCountry()+PLACES_SUFIX), Places.class);
		
				
		//Weather weather = restTemplate.getForObject(new URI(WEATHER_PREFIX+woeid+WEATHER_SUFFIX), Weather.class);
		//Query query = weather.getQuery();
		
		
		//model.addAttribute("forecast", query.getResults().getChannel().getItem().getDescription());
		//model.addAttribute("forecast", places.getQuery().getResults().getChannel().getItem());
		
		Tiempo tt = new Tiempo();
		
		
		
		
		model.addAttribute("forecast", places.getQuery().getResults().getChannel().getItem().getForecast().get(0));
		//model.addAttribute("forecastt", model);
		
		
		//obtener who y id de la primera;
		//System.out.println("El woeid de: "+country.getCountry()+" es: "+woeid);
		
		
		return "resul";
	}
	
	

}
