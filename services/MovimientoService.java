package es.nextdigital.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import es.nextdigital.demo.models.CuentaModel;
import es.nextdigital.demo.models.MovimientoModel;
import es.nextdigital.demo.repositories.IMovimientoRepository;

public class MovimientoService implements IMovimientoRepository{

	@Autowired
	IMovimientoRepository movesRepository;
	
	


	@SuppressWarnings("null")
	public List<MovimientoModel> consultarMovimientosCuenta(CuentaModel cuenta) {
		List<MovimientoModel> moves = movesRepository.findAll();
		List<MovimientoModel> movesCuenta = null;
		for (MovimientoModel move: moves) {
			if (move.getCuenta() == cuenta)
				movesCuenta.add(move);
		}
		return movesCuenta;
	}
	    
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends MovimientoModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MovimientoModel> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<MovimientoModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MovimientoModel getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovimientoModel getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovimientoModel getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MovimientoModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MovimientoModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MovimientoModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovimientoModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovimientoModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MovimientoModel> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MovimientoModel> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MovimientoModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends MovimientoModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MovimientoModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<MovimientoModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MovimientoModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends MovimientoModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MovimientoModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends MovimientoModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends MovimientoModel, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
