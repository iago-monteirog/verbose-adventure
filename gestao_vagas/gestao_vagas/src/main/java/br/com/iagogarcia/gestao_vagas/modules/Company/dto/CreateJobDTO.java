package br.com.iagogarcia.gestao_vagas.modules.Company.dto;

import lombok.Data;

@Data
public class CreateJobDTO {

  private String description;
  private String benefits;
  private String level;
}
