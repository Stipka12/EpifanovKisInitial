package ru.miit.kisproject.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.miit.kisproject.model.DataStorage;
import ru.miit.kisproject.model.SysOptions;

import java.util.List;


@RestController
@RequestMapping("/kis")

public class KisController {

    @Autowired
    DataStorage dataStorage;


    @GetMapping(value = "/sys_options", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysOptions> getSysOptions(){
        return dataStorage.getSysOptionsList();
    }
}
