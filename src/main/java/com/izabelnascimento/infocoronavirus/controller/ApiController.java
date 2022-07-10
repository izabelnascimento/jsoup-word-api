package com.izabelnascimento.infocoronavirus.controller;

import com.izabelnascimento.infocoronavirus.domain.Substantive;
import com.izabelnascimento.infocoronavirus.domain.Word;
import com.izabelnascimento.infocoronavirus.service.SubstantivesService;
import com.izabelnascimento.infocoronavirus.service.WordService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ApiController {

    private final SubstantivesService substantivesService;
    private final WordService wordService;

    @GetMapping
    public ResponseEntity<List<Substantive>> getSubstantives(@RequestParam String word) throws IOException {
        List<Substantive> substantives = this.substantivesService.findSubstantives(word);
        return ResponseEntity.ok(substantives);
    }

    @GetMapping("more-searched")
    public ResponseEntity<Word> getMoreSearched() {
        Word word = this.wordService.getMoreSearched();
        return ResponseEntity.ok(word);
    }

}
