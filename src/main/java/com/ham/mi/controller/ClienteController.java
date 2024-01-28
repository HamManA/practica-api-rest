package com.ham.mi.controller;

import com.ham.mi.model.dtos.ClienteDto;
import com.ham.mi.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("cliente")
    public ClienteDto crearCliente(@RequestBody ClienteDto cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    public ClienteDto actualizaCliente(@RequestBody ClienteDto cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    public void borrarCliente(@PathVariable Integer id){
        ClienteDto clienteDel = clienteService.findById(id);
        clienteService.delete(clienteDel);
    }

    @GetMapping("cliente/{id}")
    public ClienteDto mostrarById(@PathVariable Integer id){
        return clienteService.findById(id);
    }
}
