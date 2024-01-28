package com.ham.mi.repositories;

import com.ham.mi.model.dtos.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends CrudRepository<ClienteDto, Integer> {
}
