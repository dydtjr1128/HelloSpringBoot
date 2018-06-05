package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	//JpaRepository는 CrudRepository를 상속받은 PagingAndSortingRepository를 상속받은 클래스이다.
	//CRUD가 구현된 곳에 추가한 findByLastName 메서드이다. 이름만 주어도 구성해준다.
	List<Customer> findByLastName(String lastName);

}