package pe.edu.untels.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="Propietario")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPropietario;
    @Column(name = "namePropietario",length = 35,nullable = false)
    private  String namePropietario;
    @Column(name = "emailPropietario",length = 35,nullable = false)
    private String emailPropietario;

    public Propietario() {
    }

    public Propietario(int idPropietario, String namePropietario, String emailPropietario) {
        this.idPropietario = idPropietario;
        this.namePropietario = namePropietario;
        this.emailPropietario = emailPropietario;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNamePropietario() {
        return namePropietario;
    }

    public void setNamePropietario(String namePropietario) {
        this.namePropietario = namePropietario;
    }

    public String getEmailPropietario() {
        return emailPropietario;
    }

    public void setEmailPropietario(String emailPropietario) {
        this.emailPropietario = emailPropietario;
    }
}
