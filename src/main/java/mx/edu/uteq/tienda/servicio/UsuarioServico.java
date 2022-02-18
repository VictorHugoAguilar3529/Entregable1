package mx.edu.uteq.tienda.servicio;

import mx.edu.uteq.tienda.dto.UsuarioRegistroDto;
import mx.edu.uteq.tienda.modelo.Usuario;

public interface UsuarioServico {
	public Usuario save(UsuarioRegistroDto registroDTO);

}
