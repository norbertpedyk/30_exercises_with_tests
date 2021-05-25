package pl.pedyk.exercise3;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.sqrt;

public class PointIn3D {
    private final int x;
    private final int y;
    private final int z;

    public PointIn3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "PointIn3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double distance(PointIn3D pointIn3D) {
        return calculate(pointIn3D);
    }

    private double calculate(PointIn3D pointIn3D) {
        return BigDecimal.valueOf(sqrt((this.x - pointIn3D.getX()) * (this.x - pointIn3D.getX()) +
                (this.y - pointIn3D.getY()) * (this.y - pointIn3D.getY()) +
                (this.z - pointIn3D.getZ()) * (this.z - pointIn3D.getZ())
        )).setScale(6, RoundingMode.HALF_UP).doubleValue();
    }
}
