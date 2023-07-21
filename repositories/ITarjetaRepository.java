package es.nextdigital.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.nextdigital.demo.models.TarjetaModel;

public interface ITarjetaRepository extends JpaRepository<TarjetaModel, Long>{

}
