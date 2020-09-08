package org.lzh.shirospringboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Client implements Serializable {

    private Long id;

    private String name;

    private String password;

    private String perms;

}
