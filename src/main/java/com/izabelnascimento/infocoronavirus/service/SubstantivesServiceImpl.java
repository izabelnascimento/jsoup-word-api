package com.izabelnascimento.infocoronavirus.service;

import com.izabelnascimento.infocoronavirus.domain.Substantive;
import com.izabelnascimento.infocoronavirus.domain.Word;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SubstantivesServiceImpl implements SubstantivesService {

    private final WordService wordService;

    @Override
    public List<Substantive> findSubstantives(String word) throws IOException {

        List<Substantive> substantives = new ArrayList<>();

        Document document = Jsoup.connect("https://dicionariocriativo.com.br/analogico/" + word).get();

        for (int column = 1; column <= 3; column++) {
            for (int row = 1; row <= 5; row++) {
                String text = document.select("#contentList > li:nth-child(1) > ul:nth-child("
                        + column + ") > li:nth-child("
                        + row + ") > a").text();
                if (!text.isEmpty() && !text.equals(word)) substantives.add(Substantive
                        .builder()
                        .name(text)
                        .build());
            }
        }

        if (!substantives.isEmpty()) this.wordService.save(Word.builder().name(word).build());

        return substantives;
    }
}
