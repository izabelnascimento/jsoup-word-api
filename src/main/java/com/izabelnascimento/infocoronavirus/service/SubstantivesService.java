package com.izabelnascimento.infocoronavirus.service;

import com.izabelnascimento.infocoronavirus.domain.Substantive;

import java.io.IOException;
import java.util.List;

public interface SubstantivesService {

    List<Substantive> findSubstantives(String word) throws IOException;


}
