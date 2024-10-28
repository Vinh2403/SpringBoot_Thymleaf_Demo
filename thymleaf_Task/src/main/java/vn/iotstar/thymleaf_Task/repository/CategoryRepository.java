package vn.iotstar.thymleaf_Task.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import groovy.lang.Category;
import vn.iotstar.thymleaf_Task.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
			//Tim kiem theo noi dung ten:
	List<CategoryEntity> findbyNameContaining(String name);
			//Tim kiem va phan trang:
	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);
}
