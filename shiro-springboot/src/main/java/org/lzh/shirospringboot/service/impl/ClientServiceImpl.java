package org.lzh.shirospringboot.service.impl;

import org.lzh.shirospringboot.mapper.ClientMapper;
import org.lzh.shirospringboot.pojo.Client;
import org.lzh.shirospringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientMapper clientMapper;
    @Override
    public Client queryClientByName(String name) {
        return clientMapper.queryClientByName(name);
    }
}
