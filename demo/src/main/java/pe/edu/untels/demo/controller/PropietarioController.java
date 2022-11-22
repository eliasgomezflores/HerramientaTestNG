package pe.edu.untels.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.untels.demo.entities.Propietario;
import pe.edu.untels.demo.services.IPropietarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/propietarios")
public class PropietarioController {
    @Autowired
    private IPropietarioService pService;
    @PostMapping
    public void registrar(@RequestBody Propietario p) {
        pService.insertar(p);
    }
    @GetMapping
    public List<Propietario> listar() {
        return pService.listar();
    }
    @PutMapping
    public void modificar(@RequestBody Propietario p) {
        pService.insertar(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }
    @PostMapping("/buscar")
    public List<Propietario> buscar(@RequestBody String nombre) throws ParseException {        List<Propietario> listaPropietarios;
        listaPropietarios = pService.buscarNombre(nombre);
        return listaPropietarios;
    }

    @GetMapping("/{id}")
    public Optional<Propietario> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
