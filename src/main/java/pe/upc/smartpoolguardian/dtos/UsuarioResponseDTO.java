package pe.upc.smartpoolguardian.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioResponseDTO {
    private String nombreUsuario;
    private String email;
    private String numeroCelular;
}
