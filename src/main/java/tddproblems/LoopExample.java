package tddproblems;

import java.util.Vector;

class LoopExample {
    public static void main(String[] args) {
        Vector v = new Vector(214444);
        Vector v1 = new Vector(214744444);
        Vector v2 = new Vector(214444);
        System.out.println("Memory Leaks");
    }
}