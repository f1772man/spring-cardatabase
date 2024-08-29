package com.packt.cardatabase.domain;

//import java.util.List;
//import java.util.Optional;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

// long -> Long long 형태의 숫자를 Long 형태의 클래스로 변경
// <> <- 여기에는 클리스만 표시가능함.
// long -> Long (wrapper 클래스)
// int -> Integer, float -> Float, 
//, PagingAndSortingRepository<Owner, Long>
public interface OwnerRepository extends CrudRepository<Owner, Long>{

}
