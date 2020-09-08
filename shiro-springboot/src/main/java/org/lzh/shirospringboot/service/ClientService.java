package org.lzh.shirospringboot.service;

import org.lzh.shirospringboot.pojo.Client;

public interface ClientService {

    public Client queryClientByName(String name);
}
