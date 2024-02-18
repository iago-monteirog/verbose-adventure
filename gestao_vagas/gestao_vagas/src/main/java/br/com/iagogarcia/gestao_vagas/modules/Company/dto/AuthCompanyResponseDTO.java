package br.com.iagogarcia.gestao_vagas.modules.Company.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthCompanyResponseDTO {
  private String acess_token;
  private Long expires_in;
}
