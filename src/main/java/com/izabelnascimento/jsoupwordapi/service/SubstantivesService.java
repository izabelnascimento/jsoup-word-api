package com.izabelnascimento.jsoupwordapi.service;

import com.izabelnascimento.jsoupwordapi.domain.Substantive;

import java.io.IOException;
import java.util.List;

public interface SubstantivesService {

    List<Substantive> findSubstantives(String word) throws IOException;


}
