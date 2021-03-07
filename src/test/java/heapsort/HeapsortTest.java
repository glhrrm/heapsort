package heapsort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class HeapsortTest {

    private Heapsort heapsort = new Heapsort();

    @Test
    public void ordenarArrayDeVariosElementos() {
        int[] array = { 3, 9, 2, 6, 0 };
        int[] arrayOrdenado = { 0, 2, 3, 6, 9 };
        heapsort.sort(array);
        assertArrayEquals(arrayOrdenado, array);
    }

    @Test
    public void ordenarArrayDeUmElemento() {
        int[] array = { 5 };
        int[] arrayOrdenado = { 5 };
        heapsort.sort(array);
        assertArrayEquals(arrayOrdenado, array);
    }

    @Test
    public void ordenarArrayComNegativos() {
        int[] array = { -1, 7, 4, -6, 0 };
        int[] arrayOrdenado = { -6, -1, 0, 4, 7 };
        heapsort.sort(array);
        assertArrayEquals(arrayOrdenado, array);
    }

    @Test
    public void ordenarArrayVazio() {
        int[] array = {};
        int[] arrayOrdenado = {};
        heapsort.sort(array);
        assertArrayEquals(arrayOrdenado, array);
    }
}