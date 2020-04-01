package com.zsj.dota.Handler;

import com.zsj.dota.entitty.Dota;
import com.zsj.dota.repository.DotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DotaHandler {

    @Autowired
    private DotaRepository dotaRepository;

    @GetMapping("/findAll")
    public List<Dota> findAll(Dota dota){
        return dotaRepository.findAll();
    }
}
