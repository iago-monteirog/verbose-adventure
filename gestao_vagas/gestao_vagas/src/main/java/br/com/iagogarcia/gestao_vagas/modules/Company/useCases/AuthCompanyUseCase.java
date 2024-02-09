package br.com.iagogarcia.gestao_vagas.modules.Company.useCases;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.iagogarcia.gestao_vagas.modules.Company.dto.AuthCompanyDTO;
import br.com.iagogarcia.gestao_vagas.modules.Company.repositories.CompanyRespository;

@Service
public class AuthCompanyUseCase {
  @Autowired
  private CompanyRespository companyRespository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public void execute(AuthCompanyDTO authCompanyDTO) throws AuthenticationException {
    var company = this.companyRespository.findByUsername((authCompanyDTO.getUsername())).orElseThrow(
        () -> {
          throw new UsernameNotFoundException("Company not found");
        });

    // verify the password
    var passwordMatches = this.passwordEncoder.matches(authCompanyDTO.getPassword(), company.getPassword());

    if (!passwordMatches) {
      throw new AuthenticationException();
    }
  }
}
