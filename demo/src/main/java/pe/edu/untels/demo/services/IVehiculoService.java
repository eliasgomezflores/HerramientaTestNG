package pe.edu.untels.demo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import pe.edu.untels.demo.entities.Vehiculo;

public interface IVehiculoService {

	public boolean insertar(Vehiculo vehiculo);

	public void eliminar(int idVehiculo);

	Optional<Vehiculo> listarId(int idVehiculo);

	List<Vehiculo> listar();

	List<Vehiculo> buscarPropietario(String namePropietario);

	List<Vehiculo> buscarVehiculo(String licensePlateVehiculo);

	List<Vehiculo> findBymanufacturingDateVehiculo(Date manufacturingDateVehiculo);
}
