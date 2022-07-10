package com.izabelnascimento.jsoupwordapi.controller;

import com.izabelnascimento.jsoupwordapi.domain.Substantive;
import com.izabelnascimento.jsoupwordapi.domain.Word;
import com.izabelnascimento.jsoupwordapi.service.SubstantivesService;
import com.izabelnascimento.jsoupwordapi.service.WordService;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation("Retorna os Substantivos relacionados a palavra passada no parâmetro")
    public ResponseEntity<List<Substantive>> getSubstantives(@RequestParam String word) throws IOException {
        List<Substantive> substantives = this.substantivesService.findSubstantives(word);
        return ResponseEntity.ok(substantives);
    }

    @GetMapping("more-searched")
    @ApiOperation("Retorna a palavra mais pesquisada")
    public ResponseEntity<Word> getMoreSearched() {
        Word word = this.wordService.getMoreSearched();
        return ResponseEntity.ok(word);
    }

}
