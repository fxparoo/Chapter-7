package com.Knight.test;

import com.fxparoo.Knight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {
    Knight knight;

    @BeforeEach
    void setUp() {
        knight = new Knight();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testKnight(){
        int[] horizontal = {2,2,1,-2,1,1,2,-1};
        int[] vertical = {1,-1,2,1,2,-2,1,2};
        knight.moveKnight(horizontal, vertical);
        knight.showBoard();
    }
}