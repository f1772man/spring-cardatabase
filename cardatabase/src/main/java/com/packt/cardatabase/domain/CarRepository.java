package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//@RepositoryRestResource(path="vehicles")
public interface CarRepository extends CrudRepository<Car, Long>{
//	, PagingAndSortingRepository<Car, Long>
//	long count(); // 엔티티 수 반환
//
//	Iterable<Car> findAll(); // 지정한 형식 항목 반
//
//	Optional<Car> findById(Long id); // 지정한 id 의 한개 항목 반환
//
//	void delete(Car car); // 엔티티 삭제
//
//	void deleteAll(); // 모든 엔티티 삭제
//
//	<S extends Car> save(S entity); // entity 저장
//
//	List<S> saveAll(Iterable<S> entities); // 여러 엔티티 저장
	// 브랜드로 자동차 검색 (Page. 41)
//	@Query("select c from Car c where c.brand = ?1")
//	List<Car> findByBrand(String brand);
//
	// 색상으로 자동차 검색
//	List<Car> findByColor(String collor);

	// 연도로 자동차 검색
	List<Car> findByYear(int year);
	
	// 브랜드와 모델로 자동차 검색
	List<Car> findByBrandAndModel(String brand, String model);
	
	// 브랜드와 색상으로 자동차 검색
	List<Car> findByBrandOrColor(String brand, String color);
	
	// 검색 후 정렬 order by
	List<Car> findByBrandOrderByYearAsc(String brand);
	
	// JPA에서 제공 / SQL문을 이용해 브랜드로 자동차 검색
	@Query("select c from Car c where c.brand like %?1")
	List<Car> findByBrandEndsWith(String brand);
	// brand 명으로 죄회, 파라미터로 받음
	List<Car> findByBrand(@Param("brand") String brand);
	// color 명으로 조회, 파마미터 받음
	List<Car> findByColor(@Param("color") String color);
}
