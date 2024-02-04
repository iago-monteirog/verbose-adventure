package br.com.iagogarcia.gestao_vagas.modules.Company.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iagogarcia.gestao_vagas.modules.Company.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {

}
