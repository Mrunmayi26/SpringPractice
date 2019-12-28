package com.mrunmayi1.demo.repository;

import com.mrunmayi1.demo.model.DemoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoModel,Integer> {
}
