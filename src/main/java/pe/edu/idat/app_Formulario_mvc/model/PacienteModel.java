package pe.edu.idat.app_Formulario_mvc.model;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class PacienteModel {
    private String nropaciente;
    private String valorimc;
    private String diagnostico;
}
