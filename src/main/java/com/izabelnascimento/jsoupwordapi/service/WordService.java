package com.izabelnascimento.jsoupwordapi.service;

import com.izabelnascimento.jsoupwordapi.domain.Word;

public interface WordService {

    Word save(Word word);

    Word getMoreSearched();

}
