package tddproblems;

class LoopExample {
    public long addIncremental(long l) {
        Long sum = 0L;
        sum = sum + l;
        return sum;
    }

    public static void main(String[] args) {
        LoopExample adder = new LoopExample();
        for (long i = 0; i < 1000; i++) {
            adder.addIncremental(i);
        }
    }
}