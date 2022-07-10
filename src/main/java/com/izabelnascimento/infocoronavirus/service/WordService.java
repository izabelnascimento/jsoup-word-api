package com.izabelnascimento.infocoronavirus.service;

import com.izabelnascimento.infocoronavirus.domain.Word;

public interface WordService {

    Word save(Word word);

    Word getMoreSearched();

}
