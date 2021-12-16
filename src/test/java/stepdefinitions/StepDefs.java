package stepdefinitions;


import io.cucumber.java.es.Dado;
import net.thucydides.core.annotations.Steps;
import steps.IngresoSteps;


public class StepDefs {
    @Steps
    IngresoSteps pasos = new IngresoSteps();


@Dado("el usuario buscara la palabra facebook en el navegador")
    public void elUsuarioBuscaraLaPalabraFacebookEnElNavegador(){
    System.out.println("Entro al feature 1");
        pasos.abrirNavegador();

    }

    @Dado("el usuario ingresa a facebook")
    public void elUsuarioIngresaAFacebook(){
        System.out.println("Entro al feature 2");
        pasos.abrirNavegador2();
    }
}
