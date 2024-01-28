package com.ham.mi.services.impl;

import com.ham.mi.model.dtos.ClienteDto;
import com.ham.mi.repositories.ClienteRepository;
import com.ham.mi.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    @Override
    public ClienteDto save(ClienteDto cliente) {
        return clienteRepository.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public ClienteDto findById(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(ClienteDto cliente) {
        clienteRepository.delete(cliente);
    }
}
