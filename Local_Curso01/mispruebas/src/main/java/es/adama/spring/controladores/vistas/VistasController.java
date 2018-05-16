package es.adama.spring.controladores.vistas;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vistas/")
public class VistasController {
	
	
	@RequestMapping("hola")
	public ModelAndView modelAndView()
	{
		String mensaje = "JesuLin";
		String mensaje2 = "Bringas";
		
		Map<String, String> modelo= new HashMap<>();
		modelo.put("mensaje1", mensaje);
		modelo.put("mensaje2", mensaje2);
		return new ModelAndView("hello","modelo",modelo);
	}
	
	
	@RequestMapping("/saludos")
	public String vistaUno(Model modelo)
	{
		modelo.addAttribute("mensaje1","Maria");
		modelo.addAttribute("mensaje2","Nuevo Mensaje");
		return "hello";	
		
	}
	
	@RequestMapping("/home")
	public String home()
	{
		
		return "index";	
		
	}

}
