package br.com.ibns.pgm.membro;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<Membro,Long> {
    Page<Membro> findAllByAtivoTrue(Pageable paginacao);
    Page<Membro> findAllByAtivoFalse(Pageable paginacao);
}
