package vn.iotstar.thymleaf_Task.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import io.micrometer.common.util.StringUtils;
import vn.iotstar.thymleaf_Task.entity.CategoryEntity;
import vn.iotstar.thymleaf_Task.repository.CategoryRepository;
import vn.iotstar.thymleaf_Task.services.ICategoryService;

public class CategoryServiceImpl implements  ICategoryService  {
	@Autowired
	CategoryRepository categoryRepository;

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<CategoryEntity> findbyNameContaining(String name) {
		return categoryRepository.findbyNameContaining(name);
	}

	@Override
	public Page<CategoryEntity> findByNameContaining(String name, Pageable pageable) {
		return categoryRepository.findByNameContaining(name, pageable);
	}

	@Override
	public <S extends CategoryEntity> S save(S entity) {
		if(entity.getCategoryID() == null)
		{
			return categoryRepository.save(entity);
		}
		else {
			Optional<CategoryEntity> opt = findById(entity.getCategoryID());
			if(opt.isPresent()) {
				if(StringUtils.isEmpty(entity.getName())) {
					entity.setName(opt.get().getName());
				}else {
					//Lay lai image cu:
					entity.setName(entity.getName());
				}
				
			}
			return categoryRepository.save(entity);
		}
		
		
	}

	@Override
	public <S extends CategoryEntity> Optional<S> findOne(Example<S> example) {
		return categoryRepository.findOne(example);
	}

	@Override
	public List<CategoryEntity> findAll(Sort sort) {
		return categoryRepository.findAll(sort);
	}

	@Override
	public Page<CategoryEntity> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	@Override
	public List<CategoryEntity> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public List<CategoryEntity> findAllById(Iterable<Long> ids) {
		return categoryRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return categoryRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public void delete(CategoryEntity entity) {
		categoryRepository.delete(entity);
	}

	@Override
	public void deleteAll() {
		categoryRepository.deleteAll();
	}

	@Override
	public Optional<CategoryEntity> findById(Long id) {
		return categoryRepository.findById(id);
	}
	
}
