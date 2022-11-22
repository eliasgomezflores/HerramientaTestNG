package pe.edu.untels.demo.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.untels.demo.entities.Propietario;
import pe.edu.untels.demo.entities.Vehiculo;
import pe.edu.untels.demo.services.IVehiculoService;


@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

	@Autowired
	private IVehiculoService vService;

	@PostMapping
	public void registrar(@RequestBody Vehiculo v) {
		vService.insertar(v);
	}

	@PutMapping
	public void modificar(@RequestBody Vehiculo v) {
		vService.insertar(v);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		vService.eliminar(id);
	}

	@GetMapping
	public List<Vehiculo> listar() {
		return vService.listar();

	}

	@PostMapping("/buscar")
	public List<Vehiculo> buscar(@RequestBody Vehiculo v) throws ParseException {

		List<Vehiculo> listaVehiculos;
		listaVehiculos = vService.buscarVehiculo(v.getLicensePlateVehiculo());
		if (listaVehiculos.isEmpty()) {

			listaVehiculos = vService.buscarPropietario(v.getPropietario().getNamePropietario());
		}
		return listaVehiculos;

	}
	@GetMapping("/{id}")
	public Optional<Vehiculo> listarId(@PathVariable("id") Integer id) {
		return vService.listarId(id);
	}
}
