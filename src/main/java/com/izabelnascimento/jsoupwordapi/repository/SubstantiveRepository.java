package com.izabelnascimento.jsoupwordapi.repository;

import com.izabelnascimento.jsoupwordapi.domain.Substantive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubstantiveRepository extends JpaRepository<Substantive, Long> {
}
