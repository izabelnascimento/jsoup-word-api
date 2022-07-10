package com.izabelnascimento.jsoupwordapi.repository;

import com.izabelnascimento.jsoupwordapi.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

    Optional<Word> findByName(String name);

    Optional<Word> findByCounterGreaterThan(Long counter);

}
