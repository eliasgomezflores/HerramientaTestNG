package pe.edu.untels.demo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.untels.demo.entities.Vehiculo;


@Repository
public interface IVehiculoDAO extends JpaRepository<Vehiculo, Integer> {
	@Query("from Vehiculo v where v.propietario.namePropietario like %:namePropietario%")
	List<Vehiculo> buscarPropietario(@Param("namePropietario") String namePropietario);

	@Query("from Vehiculo v where v.licensePlateVehiculo like %:licensePlateVehiculo%")
	List<Vehiculo> buscarVehiculo(@Param("licensePlateVehiculo") String licensePlateVehiculo);

	List<Vehiculo> findBymanufacturingDateVehiculo(Date manufacturingDateVehiculo);
}
