package com.smarttalent.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class PaginaResumenCita {

   // public static final Target OUTPUT_MENSAGE = Target.the("Donde cargara el resumen de la cita").located(By.xpath("//*[@id=\"summary\"]/div/div/div[1]/p/font/font"));
    public static final Target OUT_FACILITY = Target.the("Donde encontramos el centro de atencion seleccionado").located(By.id("facility"));
    public static final Target OUT_READMISSION = Target.the("Donde seleccionamos la solicitud de una readmision hospitalaria").located(By.id("hospital_readmission"));
    public static final Target OUT_PROGRAM= Target.the("Donde encontramos el programa de salud, seguro del estado medico").located(By.id("program"));
   public static final Target OUTPUT_VISIT_DATE = Target.the("Donde encontramos la fecha de la cita").located(By.id("visit_date"));
    public static final Target OUTPUT_COMMENT = Target.the("Donde encontramos comentarios respecto a la cita").located(By.id("comment"));
}
