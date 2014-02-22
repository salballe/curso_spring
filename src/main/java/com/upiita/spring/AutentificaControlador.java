package com.upiita.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.upiita.spring.servicios.UsuarioServicio;

/*/spring ->contextroot
 * destruir proyecto corriendo en servidor
 * proyecto->properties->webprojectsettings->contextroot
 * */

@Controller
public class AutentificaControlador {
	/*instancia inyectada*/
	@Autowired
	@Qualifier(value="usuarioServicio")
	private UsuarioServicio servicio;
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String muestrainicio(Model modelo){
		modelo.addAttribute("Frase", "Bienvenidos sean todos");
		System.out.println("Mostrando inicio");
		return "index";
	}
	@RequestMapping(value="/auth",method=RequestMethod.POST)
	public String AutentificarUsuario(String nombre, String password, Integer codigo, Model modelo){
		String vista="Bienvenido";
		System.out.println("Nombre: " +nombre+" Password: "+password+" Codigo "+codigo);
		if(servicio.ValidaUsuario(nombre, password)){
			System.out.println("El usuario es valido");
			modelo.addAttribute("nombre", nombre);
		}else{
			vista="index";
		}
		
		
		return vista;
	}
	
}
