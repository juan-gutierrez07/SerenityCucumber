package steps;

import net.thucydides.core.annotations.Step;
import pageObject.Page;
import pageObject.Page2;

public class IngresoSteps {

    Page IngresoPage = new Page();
    Page2 IngresoFace = new Page2();

    @Step
    public void abrirNavegador(){
        IngresoPage.open();
    }

    @Step
    public void abrirNavegador2(){
        IngresoFace.open();
    }
}
