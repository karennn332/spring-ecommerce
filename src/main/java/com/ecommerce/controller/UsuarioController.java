package com.ecommerce.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.model.Usuario;
import com.ecommerce.service.IUsuarioService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	  private final Logger logger= LoggerFactory.getLogger(UsuarioController.class);
	
	 @Autowired
	 private IUsuarioService usuarioService;
	
	 // /usuario/registro
	 @GetMapping("/registro")
	 public String create () {
		 return "usuario/registro";
	 }
	 
	 @PostMapping("save")
	 public String save(Usuario usuario) {
		 logger.info("Usuario registro: {}", usuario);
		 usuario.setTipo("USER");
		 usuarioService.save(usuario);
		 return "redirect:/";
	 }
	 
	 @GetMapping("/login")
	 public String login() {
		 return "usuario/login";
	 }
	 
	 
	  // autenticacion manual para obtener el id del usuario y guardarlo en un seccion para poderlo llevar
	 //a todos los lugares de controladores que necesiten
	 @PostMapping("/acceder")
	 public String acceder(Usuario usuario, HttpSession session) {
		 logger.info("accesos : {}", usuario);
		 
		 Optional<Usuario> user=usuarioService.findByEmail(usuario.getEmail());
		 //logger.info("Usuario de db; {}", user.get());
		 
		 if(user.isPresent()) {
			 session.setAttribute("idusuario", user.get().getId());
			 if (user.get().getTipo().equals("ADMIN")) {
				return "redirect:/administrador";
			}else {
				return "redirect:/";
			}
		} else {
			logger.info("usuario no existe");
		}
		 	
		 return "redirect:/";
	 } 
	 
	 @GetMapping("/compras")
	 public String obtenerCompras(Model model, HttpSession session) {
		 model.addAttribute("sesion", session.getAttribute("idusuario"));
		 return "usuario/compras";
	 }
}
