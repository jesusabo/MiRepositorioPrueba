package es.adama.spring.controladores.respuestas;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/respuestas/*")
public class RespuestasController {
	
	@RequestMapping("/path")
	public @ResponseBody String respuestaConResponseBody()
	{
		return "respuestaConResponseBody";
	}
	
	
	@RequestMapping("/estado")
	public ResponseEntity<String> respuestaConResponseEntity()
	{
		return new ResponseEntity<>("No puedes pasar",HttpStatus.FORBIDDEN);
		
	}
	
	

	@RequestMapping("/estados")
	public ResponseEntity<String> respuestaConResponseEntityCompleta()
	{

		HttpHeaders cabeceras= new HttpHeaders();
		cabeceras.setContentType(MediaType.TEXT_HTML);
		return new ResponseEntity<>("<h1>mensaje de la pagina</h1>",cabeceras,HttpStatus.OK);
		
	}

}
