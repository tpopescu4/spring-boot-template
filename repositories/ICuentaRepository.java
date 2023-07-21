package es.nextdigital.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.nextdigital.demo.models.CuentaModel;

@Repository
public interface ICuentaRepository extends JpaRepository<CuentaModel, Long> {



}
