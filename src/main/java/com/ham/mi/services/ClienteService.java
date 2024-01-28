package com.ham.mi.services;

import com.ham.mi.model.dtos.ClienteDto;

public interface ClienteService {

    ClienteDto save(ClienteDto cliente);

    ClienteDto findById(Integer id);

    void delete(ClienteDto cliente);
}
