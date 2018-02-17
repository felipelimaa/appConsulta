package br.edu.unirn.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unirn.cursomc.domain.Especialidade;
import br.edu.unirn.cursomc.repositories.EspecialidadeRepository;

@Service
public class EspecialidadeService {
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;
	
	public Especialidade buscar(Integer id) {
		Especialidade obj = especialidadeRepository.findOne(id);
		return obj;
	}
	
}
