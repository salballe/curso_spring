package com.upiita.spring.servicios;

import org.springframework.stereotype.Component;

/*inyeccion de dependencias*/
@Component(value="usuarioServicio")
public class UsuarioServicioImpl implements UsuarioServicio {
	
/* (non-Javadoc)
 * @see com.upiita.spring.servicios.UsiarioServicio#ValidaUsuario(java.lang.String, java.lang.String)
 */


@Override
public boolean ValidaUsuario(String nombre, String password){
	boolean esValido = false;
	if(nombre.equals("juanito") && password.equals("123")){
		esValido=true;
	}
	return esValido;
}
}
