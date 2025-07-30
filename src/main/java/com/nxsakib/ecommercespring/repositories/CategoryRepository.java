package com.nxsakib.ecommercespring.repositories;

import com.nxsakib.ecommercespring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
