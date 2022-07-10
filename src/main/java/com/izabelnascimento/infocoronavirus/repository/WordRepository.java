package com.izabelnascimento.infocoronavirus.repository;

import com.izabelnascimento.infocoronavirus.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

    Optional<Word> findByName(String name);

    Optional<Word> findByCounterGreaterThan(Long counter);

}
