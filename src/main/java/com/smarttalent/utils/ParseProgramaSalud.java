package com.smarttalent.utils;

import com.smarttalent.exceptions.GeneralExcepcion;
import com.smarttalent.userinterfaces.PaginaDatosCita;
import net.serenitybdd.screenplay.targets.Target;

public class ParseProgramaSalud {

    public static Target parse(String programa) {
        Target targetToReturn = null;
        switch (programa) {
            case "Medicare":
                targetToReturn = PaginaDatosCita.CHECK_PROGRAM_MEDICARE;
                break;
            case "Medicaid":
                targetToReturn = PaginaDatosCita.CHECK_PROGRAM_MEDICAID;
                break;
            case "none":
                targetToReturn = PaginaDatosCita.CHECK_PROGRAM_NONE;
                break;
            default:
                throw new GeneralExcepcion("El programa de salud no existe");
        }
        return targetToReturn;
    }

}
