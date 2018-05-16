package es.adama.spring.controladores.peticiones;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/multiaccion/*")
public class MultiaccionController {
	
	
	
	@RequestMapping("/simple")
	public @ResponseBody String simple(){
		return "hola";
	}
	
	
	@RequestMapping(value=	"/revisado",method=RequestMethod.GET)
	public @ResponseBody String simpleRevisado()	{		
		return "Hola revisado";	
	}
	
	@RequestMapping(value="/parametro",method=RequestMethod.GET,params="param1")
	public @ResponseBody String peticionPorParametro(){
		return "Peticion por Parametro";
	}
	
	@RequestMapping(value="/parametro",method=RequestMethod.GET,params="!param1")
	public @ResponseBody String peticionSinParametro(){
		return "Peticion por ausencia de Parametro";
	}
	
	@RequestMapping(value="/cabeceras",method=RequestMethod.GET, headers="Accept=text/plain")
	public @ResponseBody String peticionPorCabecera(){
		return "Peticion por presencia de cabecera";
	}
	
	@RequestMapping(value="/produces",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorProduces(){
		return "Peticion por produces application/json";
	}
	
	@RequestMapping(value="/producess",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String peticionPorProducess(){
		return "Peticion por produces application/json";
	}
	
	@RequestMapping("/*")
	public @ResponseBody String peticionPorExpresionRegular(){
		return "Peticion por expresion regular";
	}

}
