package es.adama.spring.controladores.conversores;

import java.util.Collection;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/conversor/*")
public class ConversorDatosController {
	
	
//	@RequestMapping("/entero")
//	public @ResponseBody String entero(@RequestParam Integer numero)
//	{
//		return "Dato numerico convertido= "+numero;
//	}
	
	@RequestMapping("/enteroo/{numero}")
	public @ResponseBody String enteroo(@PathVariable Integer numero)
	{
		return "Dato numerico convertido= "+numero;
	}
	
	
	@RequestMapping("/fecha")
	public @ResponseBody String fecha(@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date fecha)
	{
		return "Dato fecha convertido= "+fecha;
	}
	
	@RequestMapping("/coleccion")
	public @ResponseBody String coleccion(@RequestParam Collection<Integer> coleccion)
	{
		return "Dato coleccion de numeros convertido= "+coleccion;
	}
	
	@RequestMapping("/objeto")
	public @ResponseBody String objeto(JavaBean bean)
	{
		return "Dato del bean"+bean;
	}
	

}
