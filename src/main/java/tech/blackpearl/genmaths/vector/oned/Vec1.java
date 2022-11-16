package tech.blackpearl.genmaths.vector.oned;

public record Vec1(double x) {

    public Vec1 plus(Vec1 o1) {
        return new Vec1(x + o1.x());
    }

    public Vec1 plus(double s1) {
        return new Vec1(x + s1);
    }

    public Vec1 minus(Vec1 o1) {
        return new Vec1(x - o1.x());
    }

    public Vec1 minus(double s1) {
        return new Vec1(x - s1);
    }

    public Vec1 multiply(Vec1 o1) {
        return new Vec1(x * o1.x());
    }

    public Vec1 multiply(double s1) {
        return new Vec1(x * s1);
    }

    public Vec1 divide(Vec1 o1) {
        return new Vec1(x / o1.x());
    }

    public Vec1 divide(double s1) {
        return new Vec1(x / s1);
    }
}
