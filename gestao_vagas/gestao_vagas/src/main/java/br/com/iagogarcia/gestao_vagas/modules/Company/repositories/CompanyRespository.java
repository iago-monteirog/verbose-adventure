package br.com.iagogarcia.gestao_vagas.modules.Company.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iagogarcia.gestao_vagas.modules.Company.entities.CompanyEntity;

public interface CompanyRespository extends JpaRepository<CompanyEntity, UUID> {
  Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
