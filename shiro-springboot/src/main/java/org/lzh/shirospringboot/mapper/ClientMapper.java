package org.lzh.shirospringboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lzh.shirospringboot.pojo.Client;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ClientMapper {
    Client queryClientByName(String name);
}
