package pl.pedyk.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointIn3DTest {

    @DisplayName("should compute the distance between two points in 3D")
    @Test
    void Test1() {
        //given
        PointIn3D pointIn3D1 = new PointIn3D(3, 5, 2);
        PointIn3D pointIn3D2 = new PointIn3D(1, 9, 2);
        //when
        double distance = pointIn3D1.distance(pointIn3D2);
        //then
        Assertions.assertEquals(4.472136, distance);
    }

}