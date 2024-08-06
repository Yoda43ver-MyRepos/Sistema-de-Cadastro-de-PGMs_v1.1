package br.com.ibns.pgm.pgm;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PgmRepository extends JpaRepository<Pgm, Long> {
    Page<Pgm> findAllByAtivoTrue(Pageable pagination);
}
