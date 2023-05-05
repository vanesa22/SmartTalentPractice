package com.smarttalent.tasks;

import com.smarttalent.model.DatosCita;
import com.smarttalent.userinterfaces.PaginaDatosCita;
import com.smarttalent.utils.ParseProgramaSalud;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AgregarInformacionCita implements Task {


    private DatosCita datosCita;

    public AgregarInformacionCita(DatosCita datosCita) {
        this.datosCita = datosCita;
    }

    public static AgregarInformacionCita AgregarInformacionCita(DatosCita parDatosCita) {
        return Tasks.instrumented(AgregarInformacionCita.class, parDatosCita);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (datosCita.isAtrReadmision()) {
            actor.attemptsTo(Click.on(PaginaDatosCita.CHECK_READMISSION));
        }
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosCita.getAtrCentroSalud()).from(PaginaDatosCita.SELECT_FACILITY),
                Click.on(ParseProgramaSalud.parse(datosCita.getAtrProgramaSalud())),
                Enter.theValue(datosCita.getAtrDiaCita()).into(PaginaDatosCita.INPUT_VISIT_DATE),
                Enter.theValue(datosCita.getAtrComentario()).into(PaginaDatosCita.INPUT_COMMENT),
                Click.on(PaginaDatosCita.BUTTON_BOOK_APPOINTMENT)
        );
        actor.remember("datos_cita", datosCita);
    }



}

