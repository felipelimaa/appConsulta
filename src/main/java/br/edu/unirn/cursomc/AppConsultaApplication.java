package br.edu.unirn.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.unirn.cursomc.domain.Especialidade;
import br.edu.unirn.cursomc.repositories.EspecialidadeRepository;

@SpringBootApplication
public class AppConsultaApplication implements CommandLineRunner {
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppConsultaApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Especialidade e1 = new Especialidade(null, "Clínica Médica");
		Especialidade e2 = new Especialidade(null, "Cardiologia");
		
		especialidadeRepository.save(Arrays.asList(e1,e2));
		
	}
}
