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
import es.nextdigital.demo.models.TarjetaModel;
import es.nextdigital.demo.repositories.ITarjetaRepository;

public class TarjetaService implements ITarjetaRepository{
	
	@Autowired
	ITarjetaRepository tarjetaRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends TarjetaModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TarjetaModel> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<TarjetaModel> entities) {
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
	public TarjetaModel getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaModel getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaModel getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TarjetaModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TarjetaModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TarjetaModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TarjetaModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TarjetaModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TarjetaModel> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TarjetaModel> findById(Long id) {
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
	public void delete(TarjetaModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends TarjetaModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TarjetaModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<TarjetaModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TarjetaModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends TarjetaModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends TarjetaModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends TarjetaModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends TarjetaModel, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	public TarjetaModel findByNumTarjeta(String numeroTarjeta) {
		List<TarjetaModel> tarjetas = tarjetaRepository.findAll();
		for(TarjetaModel tarjeta: tarjetas) {
			if (tarjeta.getNumeroTarjeta() == numeroTarjeta)
				return tarjeta;
		}
		return null;
	}

	public boolean puedeSacarDinero(TarjetaModel tarjeta, double montoRetiro) {
		if (!tarjeta.isCredito()) {
			if (tarjeta.getCuenta().getSaldo() < montoRetiro)
				return false;
			return true;
		}
		if ((tarjeta.getCuenta().getSaldo() * 1.5) < montoRetiro) // Credito mitad de sueldo
			return false;
		else 
			return true;
	}

	public void actualizarSaldoCuenta(TarjetaModel tarjeta, double montoRetiro) {
		CuentaModel cuenta = tarjeta.getCuenta();
		cuenta.setSaldo(cuenta.getSaldo() - montoRetiro);
		
	}

	

}
