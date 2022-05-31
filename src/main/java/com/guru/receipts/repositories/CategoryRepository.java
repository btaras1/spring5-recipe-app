package com.guru.receipts.repositories;

import com.guru.receipts.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
