package com.izabelnascimento.jsoupwordapi.service;

import com.izabelnascimento.jsoupwordapi.domain.Word;
import com.izabelnascimento.jsoupwordapi.repository.WordRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;

    @Override
    public Word save(Word word) {
        Optional<Word> byName = this.wordRepository.findByName(word.getName());
        if (byName.isPresent()) {
            byName.get().setCounter(byName.get().getCounter() + 1);
            return this.wordRepository.save(byName.get());
        }
        word.setCounter(1L);
        return wordRepository.save(word);
    }

    @Override
    public Word getMoreSearched() {
        List<Word> all = this.wordRepository.findAll();
        Long counter = 0L;
        Word moreSearched = null;
        for (Word word : all) {
            if (word.getCounter() > counter) {
                counter = word.getCounter();
                moreSearched = word;
            }
        }
        return moreSearched;
    }

}
