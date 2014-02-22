package com.upiita.spring.servicios;

public interface UsuarioServicio {

	/* (non-Javadoc)
	 * @see com.upiita.spring.servicios.UsiarioServicio#ValidaUsuario(java.lang.String, java.lang.String)
	 */
	public abstract boolean ValidaUsuario(String nombre, String password);

}