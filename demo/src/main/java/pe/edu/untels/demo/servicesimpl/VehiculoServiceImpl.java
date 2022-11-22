package pe.edu.untels.demo.servicesimpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.untels.demo.entities.Vehiculo;
import pe.edu.untels.demo.repositories.IVehiculoDAO;
import pe.edu.untels.demo.services.IVehiculoService;


@RestController
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoDAO dVehiculo;

	@Override
	@Transactional
	public boolean insertar(Vehiculo vehiculo) {
		Vehiculo objVehiculo = dVehiculo.save(vehiculo);
		if (objVehiculo == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	@Transactional
	public void eliminar(int idVehiculo) {

		dVehiculo.deleteById(idVehiculo);

	}

	@Override
	public Optional<Vehiculo> listarId(int idVehiculo) {

		return dVehiculo.findById(idVehiculo);
	}

	@Override
	public List<Vehiculo> listar() {
		return dVehiculo.findAll();
	}

	@Override
	public List<Vehiculo> buscarPropietario(String namePropietario) {
		return dVehiculo.buscarPropietario(namePropietario);
	}

	@Override
	public List<Vehiculo> buscarVehiculo(String licensePlateVehiculo) {
		return dVehiculo.buscarVehiculo(licensePlateVehiculo);
	}

	@Override
	public List<Vehiculo> findBymanufacturingDateVehiculo(Date maufacturingDateVehiculo) {
		return dVehiculo.findBymanufacturingDateVehiculo(maufacturingDateVehiculo);
	}

}
