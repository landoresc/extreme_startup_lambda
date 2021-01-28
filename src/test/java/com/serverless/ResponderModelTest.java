package com.serverless;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ResponderModelTest {
    @Test
    public void  cuandoPreguntanPorNombreEquipo(){

        ResponderModel responder = new ResponderModel();

        String pregunta = "ef32e4a0: what is your name";

        String respuesta = responder.answer(pregunta);

        assertThat(respuesta).isEqualTo("Talapo");
    }

    @Test
    public void  cuandoPreguntanPorSumaNumeros(){

        ResponderModel responder = new ResponderModel();

        String pregunta = "6a79d5c0: what is 16 plus 18";

        String respuesta = responder.answerSuma(pregunta);

        assertThat(respuesta).isEqualTo("34");
    }
}
