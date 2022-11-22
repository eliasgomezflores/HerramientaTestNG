package pe.edu.untels.demo.services;

import java.util.List;
import java.util.Optional;

import pe.edu.untels.demo.entities.Propietario;

public interface IPropietarioService {
    public void insertar(Propietario propietario);
    List<Propietario> listar();

    public void eliminar(int idPropietario);

    public Optional<Propietario> listarId(int idPropietario);

    List<Propietario> buscarNombre(String namePropietario);


}
