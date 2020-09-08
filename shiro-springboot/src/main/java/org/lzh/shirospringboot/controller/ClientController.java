package org.lzh.shirospringboot.controller;

import org.lzh.shirospringboot.pojo.Client;
import org.lzh.shirospringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;
    @GetMapping("getClient")
    public Client getClient(@RequestParam(name = "name") String name){
        return clientService.queryClientByName(name);
    }
}
