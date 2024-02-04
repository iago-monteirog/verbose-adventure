package br.com.iagogarcia.gestao_vagas.modules.Company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.iagogarcia.gestao_vagas.exceptions.UserFoundException;
import br.com.iagogarcia.gestao_vagas.modules.Company.entities.CompanyEntity;
import br.com.iagogarcia.gestao_vagas.modules.Company.repositories.CompanyRespository;

@Service
public class CreateCompanyUseCase {
  @Autowired
  private CompanyRespository companyRespository;

  public CompanyEntity execute(CompanyEntity companyEntity) {
    this.companyRespository
        .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
        .ifPresent((user) -> {
          throw new UserFoundException();
        });
    return this.companyRespository.save(companyEntity);
  }
}
