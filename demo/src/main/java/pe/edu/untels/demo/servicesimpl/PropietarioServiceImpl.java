package pe.edu.untels.demo.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.untels.demo.entities.Propietario;
import pe.edu.untels.demo.repositories.IPropietarioDAO;
import pe.edu.untels.demo.services.IPropietarioService;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
@Autowired
    private IPropietarioDAO dPropietario;
    @Override
    public void insertar(Propietario propietario) {
        dPropietario.save(propietario);
    }

    @Override
    public List<Propietario> listar() {
        return dPropietario.findAll();
    }

    @Override
    public void eliminar(int idPropietario) {
        dPropietario.deleteById(idPropietario);
    }

    @Override
    public Optional<Propietario> listarId(int idPropietario) {
        return dPropietario.findById(idPropietario);
    }

    @Override
    public List<Propietario> buscarNombre(String namePropietario) {
        return dPropietario.buscarNombre(namePropietario);
    }


}
