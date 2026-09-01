package ifrn.pi.Eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.Eventos.models.Evento;

@Controller
public class EventoController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@RequestMapping("/eventos")
	public String salvar(Evento evento) {

		System.out.println("Nome: " + evento.getNome());
		System.out.println("Local: " + evento.getLocal());
		System.out.println("Data: " + evento.getData());
		System.out.println("Horário: " + evento.getHorario());

		return "eventoSalvo";
	}
}