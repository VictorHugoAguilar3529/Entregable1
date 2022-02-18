package mx.edu.uteq.tienda.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.edu.uteq.tienda.dto.UsuarioRegistroDto;
import mx.edu.uteq.tienda.servicio.UsuarioServico;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

	private UsuarioServico usuarioServicio;

	public RegistroUsuarioControlador(UsuarioServico usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDto retornarNuevoUsuarioRegistrarDTO() {
		return new UsuarioRegistroDto();
	}
	
	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDto usuarioRegistroDTO) {
		usuarioServicio.save(usuarioRegistroDTO);
		return "redirect:/registro?exito";	
	}
}
