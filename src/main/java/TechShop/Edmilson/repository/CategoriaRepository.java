package TechShop.Edmilson.repository;

import TechShop.Edmilson.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
    // Este método es necesario para la línea 26 de tu servicio
    List<Categoria> findByActivoTrue();
}