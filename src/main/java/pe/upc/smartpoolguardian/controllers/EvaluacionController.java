package pe.upc.smartpoolguardian.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.upc.smartpoolguardian.entities.Medicion;
import pe.upc.smartpoolguardian.servicesinterfaces.IEvaluacionService;
import pe.upc.smartpoolguardian.servicesinterfaces.IMedicionService;
import pe.upc.smartpoolguardian.servicesinterfaces.IPiscinaService;

import java.util.Optional;

@RestController
@RequestMapping("/api/evaluacion")
public class EvaluacionController {
    @Autowired
    private IEvaluacionService eS;


}
