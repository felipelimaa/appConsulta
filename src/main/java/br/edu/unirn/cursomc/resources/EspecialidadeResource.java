package br.edu.unirn.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unirn.cursomc.domain.Especialidade;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Especialidade> listar() {
		Especialidade e1 = new Especialidade(1,"Clínica Médica");
		Especialidade e2 = new Especialidade(2,"Cardiologia");
		
		List<Especialidade> lista = new ArrayList<>();
		lista.add(e1);
		lista.add(e2);
		
		return lista;
	}

}
