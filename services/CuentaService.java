package es.nextdigital.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import es.nextdigital.demo.models.CuentaModel;
import es.nextdigital.demo.repositories.ICuentaRepository;

@Service
public class CuentaService implements ICuentaRepository {
	
	@Autowired
    private ICuentaRepository cuentaRepository;

	@Override
	public <S extends CuentaModel> S save(S entity) {
		return cuentaRepository.save(entity);
	}

	@Override
	public <S extends CuentaModel> List<S> saveAll(Iterable<S> entities) {
		cuentaRepository.saveAll(entities);
		return (List<S>) entities;
	}

	@Override
	public Optional<CuentaModel> findById(Long id) {
		// TODO Auto-generated method stub
		return cuentaRepository.findById(id);
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
		cuentaRepository.deleteById(id);
	}

	@Override
	public void delete(CuentaModel entity) {
		// TODO Auto-generated method stub
		cuentaRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends CuentaModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CuentaModel> findAll() {
	    List<CuentaModel> cuentas = new ArrayList<>();
	    cuentaRepository.findAll().forEach(cuentas::add);
	    return cuentas;
	}

	@Override
	public List<CuentaModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends CuentaModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaModel> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<CuentaModel> entities) {
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
	public CuentaModel getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CuentaModel getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CuentaModel getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CuentaModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CuentaModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends CuentaModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CuentaModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends CuentaModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends CuentaModel, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	public double calcularComision(double montoRetiro) {
		montoRetiro *= 1.15;
		return montoRetiro;
	}


	

}
