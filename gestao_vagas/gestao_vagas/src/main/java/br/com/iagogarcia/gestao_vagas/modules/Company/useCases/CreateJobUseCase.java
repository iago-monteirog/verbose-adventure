package br.com.iagogarcia.gestao_vagas.modules.Company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.iagogarcia.gestao_vagas.modules.Company.entities.JobEntity;
import br.com.iagogarcia.gestao_vagas.modules.Company.repositories.JobRepository;

@Service
public class CreateJobUseCase {

  @Autowired
  private JobRepository jobRepository;

  public JobEntity execute(JobEntity jobEntity) {
    return this.jobRepository.save(jobEntity);
  }
}
