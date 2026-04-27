package pe.upc.smartpoolguardian.dtos;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonPropertyOrder({"piscinaId, nombrePiscina, volumen"})
public interface PiscinasPorUsuarioDTO {
    int getPiscinaId();
    String getNombrePiscina();
    double getVolumen();
}
