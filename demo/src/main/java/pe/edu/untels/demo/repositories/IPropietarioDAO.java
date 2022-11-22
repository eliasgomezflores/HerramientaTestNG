package pe.edu.untels.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.untels.demo.entities.Propietario;

import java.util.List;

@Repository
public interface IPropietarioDAO extends JpaRepository<Propietario,Integer> {

    @Query("from Propietario p where p.namePropietario like %:namePropietario%")
    List<Propietario> buscarNombre(@Param("namePropietario") String namePropietario);
}
