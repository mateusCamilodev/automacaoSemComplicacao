package br.com.chronosacademy.Media;

import org.junit.Test;

import static org.junit.Assert.*;


public class MediaTest {


    @Test
    public void validaAprovado() {
        MediaMain media = new MediaMain();
        String resultado = media.calculaMedia(4.9, 5.0);
        assertEquals("Aprovado", resultado);
    }


    @Test
    public void validaReprovado() {
        MediaMain media = new MediaMain();
        String resultado = media.calculaMedia(4.9, 5.0);
        assertEquals("Reprovado", resultado);

    }
}