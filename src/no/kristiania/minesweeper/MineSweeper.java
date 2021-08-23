package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineSweeper {
    @Test 
    void showEmptyBoard(){
        assertArrayEquals(new String[]{"000"}, displeyField(new String[] {". . . "}));
    }

    private Object[] displeyField(String[] strings) {
    }
}
