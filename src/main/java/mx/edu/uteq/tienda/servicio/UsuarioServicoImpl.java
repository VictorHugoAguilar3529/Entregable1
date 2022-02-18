package mx.edu.uteq.tienda.servicio;

import java.util.Arrays;

import org.springframework.stereotype.Service;
import mx.edu.uteq.tienda.dto.UsuarioRegistroDto;
import mx.edu.uteq.tienda.modelo.Rol;
import mx.edu.uteq.tienda.modelo.Usuario;
import mx.edu.uteq.tienda.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicoImpl implements UsuarioServico {

	private UsuarioRepositorio usuarioRepositorio;

	public UsuarioServicoImpl(UsuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public Usuario save(UsuarioRegistroDto registroDTO) {
		Usuario usuario = new Usuario(registroDTO.getNombre(), 
				registroDTO.getApellido(), registroDTO.getEmail(), 
				registroDTO.getPassword(), Arrays.asList(new Rol("ROL_USER")));
		return usuarioRepositorio.save(usuario);
	}

}
