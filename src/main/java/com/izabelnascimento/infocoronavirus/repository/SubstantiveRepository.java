package com.izabelnascimento.infocoronavirus.repository;

import com.izabelnascimento.infocoronavirus.domain.Substantive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubstantiveRepository extends JpaRepository<Substantive, Long> {
}
