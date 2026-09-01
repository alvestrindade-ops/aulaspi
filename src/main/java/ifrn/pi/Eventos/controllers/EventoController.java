package ifrn.pi.Eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.Eventos.models.Evento;
import ifrn.pi.Eventos.repositories.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@PostMapping("/eventos")
	public String salvar(Evento evento) {
 
		System.out.println(evento);
		er.save(evento);
		

		return "eventoSalvo";
	}
}