package com.AExVeS.AExVeS.representation_body.domain;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

public class RepresentationBody {
	private @Getter @Setter String _id;
    private @Getter @Setter String nombre;
    private @Getter @Setter ArrayList<String> ids_representantes_socios;
    private @Getter @Setter String fecha_toma_posesion;
}
