package com.example.calculadora;

import junit.framework.TestCase;
import android.widget.EditText;

public class pesoTest extends TestCase {

    private peso pesoActivity;

    protected void setUp() {
        pesoActivity = new peso();
    }
    public class peso {
        private EditText etPeso;
        private EditText etAltura;

        public void setAltura(String altura) {
            etAltura.setText(altura);
        }

        public void setPeso(String peso) {
            etPeso.setText(peso);
        }
    }

    public void testImc() {
        pesoActivity.setPeso("70");
        pesoActivity.setAltura("1.75");
        pesoActivity.imc(null); // Llamamos al método imc con una View nula

        assertEquals("El IMC calculado no es el esperado", "22.86", pesoActivity.getEtResultado().getText().toString());
    }

    public void testBorrar() {
        // Caso de prueba para el método borrar
        pesoActivity.setPeso("70");
        pesoActivity.setAltura("1.75");
        pesoActivity.imc(null);

        pesoActivity.borrar(null); // Llamamos al método borrar con una View nula

        assertEquals("El campo de peso no se ha borrado correctamente", "", pesoActivity.getEtPeso().getText().toString());
        assertEquals("El campo de altura no se ha borrado correctamente", "", pesoActivity.getEtAltura().getText().toString());
        assertEquals("El campo de resultado no se ha borrado correctamente", "", pesoActivity.getEtResultado().getText().toString());
        assertEquals("La variable pi no se ha reiniciado correctamente", 0.0, pesoActivity.getPi());
        assertEquals("La variable piup no se ha reiniciado correctamente", 0.0, pesoActivity.getPiup());
        assertEquals("La variable pidown no se ha reiniciado correctamente", 0.0, pesoActivity.getPidown());
        assertTrue("El checkbox cbFemenino no se ha habilitado correctamente", pesoActivity.getCbFemenino().isEnabled());
        assertTrue("El checkbox cbMasculino no se ha habilitado correctamente", pesoActivity.getCbMasculino().isEnabled());
        assertFalse("El checkbox cbFemenino no se ha desmarcado correctamente", pesoActivity.getCbFemenino().isChecked());
        assertFalse("El checkbox cbMasculino no se ha desmarcado correctamente", pesoActivity.getCbMasculino().isChecked());
    }

}
