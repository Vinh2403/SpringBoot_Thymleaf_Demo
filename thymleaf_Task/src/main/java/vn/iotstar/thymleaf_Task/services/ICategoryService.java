package vn.iotstar.thymleaf_Task.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.iotstar.thymleaf_Task.entity.CategoryEntity;
@Service
public interface ICategoryService {

	List<CategoryEntity> findByNameContaining(String name);

	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);

	<S extends CategoryEntity> S save(S entity);

	<S extends CategoryEntity> Optional<S> findOne(Example<S> example);

	List<CategoryEntity> findAll(Sort sort);

	Page<CategoryEntity> findAll(Pageable pageable);

	List<CategoryEntity> findAll();

	List<CategoryEntity> findAllById(Iterable<Long> ids);

	long count();

	void deleteById(Long id);

	void delete(CategoryEntity entity);

	void deleteAll();

	Optional<CategoryEntity> findById(Long id);

}