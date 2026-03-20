package co.edu.unbosque.proyectomodulo.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import co.edu.unbosque.proyectomodulo.entity.Admin;
import java.util.List;

public interface AdminRepository extends CrudRepository<Admin, Long> {

	public Optional<List<Admin>> findByNombre(String nombre);

}
