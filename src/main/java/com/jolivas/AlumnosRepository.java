package com.jolivas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnosRepository extends JpaRepository<Alumno,Long> {
	Alumno findByNombre(String nombre);
}
