package com.smarttalent.questions;

import com.smarttalent.model.DatosCita;
import com.smarttalent.userinterfaces.PaginaResumenCita;
import com.smarttalent.utils.ParseReadmision;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionResumenCita implements Question<Boolean> {


    public static ValidacionResumenCita resumenEsCorrecto() {
        return new ValidacionResumenCita();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean varResultado = false;

        DatosCita datosCita = actor.recall("datos_cita");

        String centroMedicoResumen = Text.of(PaginaResumenCita.OUT_FACILITY).viewedBy(actor).asString();
        String fechaCitaResumen = Text.of(PaginaResumenCita.OUTPUT_VISIT_DATE).viewedBy(actor).asString();
        String readmisionResumen = Text.of(PaginaResumenCita.OUT_READMISSION).viewedBy(actor).asString();
        boolean readmisionResumenParsed = ParseReadmision.parse(readmisionResumen);
        String programaMedicoResumen = Text.of(PaginaResumenCita.OUT_PROGRAM).viewedBy(actor).asString();
        String comentarioResumen = Text.of(PaginaResumenCita.OUTPUT_COMMENT).viewedBy(actor).asString();

        if (centroMedicoResumen.equals(datosCita.getAtrCentroSalud()) &&
                fechaCitaResumen.equals(datosCita.getAtrDiaCita()) &&
                programaMedicoResumen.equals(datosCita.getAtrProgramaSalud()) &&
                comentarioResumen.equals(datosCita.getAtrComentario()) &&
                readmisionResumenParsed == datosCita.isAtrReadmision()) {
            varResultado = true;
        }

        return varResultado;
    }
}
