// Source code is decompiled from a .class file using FernFlower decompiler.
package com.mtw.logeoregistrar.Repositories;

import com.mtw.logeoregistrar.Models.ReservaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaModel, Long> {
}
