package es.adama.spring.controladores.datos;

import java.io.Reader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
//import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/datos/*")
public class DatosController {

	
	//con query string
	@RequestMapping(value="/parametro",method=RequestMethod.GET)
	public @ResponseBody String conParametro(@RequestParam String param1){
		return "Valor obtenido del param1=" +param1;
	}
	
	
	//con path variable
		@RequestMapping(value="/pathvariable/{param1}",method=RequestMethod.GET)
		public @ResponseBody String conPathVariable(@PathVariable String param1){
			return "Valor obtenido del param1=" +param1;
		}
		
		//con matrix variable
//		@RequestMapping(value="/{param1}/cualquiercosa",method=RequestMethod.GET)
//		public @ResponseBody String conMatrixVariable(@PathVariable String param1,@MatrixVariable String varibleMatrix){
//			return "Valor obtenido de la varible matrix= " +varibleMatrix+ " del segmento param1= "  +param1;
//		}	
//		
//		//con matrix variable
//				@RequestMapping(value="/{param1}",method=RequestMethod.GET)
//				public @ResponseBody String conMatrixVariablee(@PathVariable String param1,@MatrixVariable String varibleMatrix){
//					return "Valor obtenido de la varible matrix= " +varibleMatrix+ " del segmento param1= "  +param1;
//				}	
		
		@RequestMapping("/pagina2")
		public String pagina2()
		{
			System.out.println("pagina2");
			return "resul";
		}

		//con cabeceras
		@RequestMapping(value="/cabeceras",method=RequestMethod.GET)
		public @ResponseBody String conCabeceras(@RequestHeader String Accept){
			return "Valor obtenido de la varible matrix= "+Accept ;
		}
		
		//con cabeceras
		@RequestMapping(value="/cabecerass",method=RequestMethod.GET)
		public @ResponseBody String conCabecerass(@RequestHeader(value="User-Agent") String UserAgent){
			return "Valor obtenido de la cabecera= "+UserAgent ;
		}
		
		//con cookies
		@RequestMapping(value="/cookies",method=RequestMethod.GET)
		public @ResponseBody String conCookies(@CookieValue String JSESSIONID){
			return "Valor obtenido de la cabecera= "+JSESSIONID ;
		}
		
		//con body post
		@RequestMapping(value="/body",method=RequestMethod.POST)
		public @ResponseBody String conBody(@RequestBody String body){
			return "Valor obtenido del body= "+body ;
		}
		
}

