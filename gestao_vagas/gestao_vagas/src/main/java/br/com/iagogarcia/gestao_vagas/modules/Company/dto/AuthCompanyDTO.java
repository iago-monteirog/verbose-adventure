package br.com.iagogarcia.gestao_vagas.modules.Company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthCompanyDTO {
  private String password;
  private String username;
}
