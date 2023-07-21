package es.nextdigital.demo.repositories;

import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import es.nextdigital.demo.models.MovimientoModel;

public interface IMovimientoRepository extends JpaRepository<MovimientoModel, Long>{

	<S extends MovimientoModel, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

}
