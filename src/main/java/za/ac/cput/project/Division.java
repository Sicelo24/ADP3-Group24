package za.ac.cput.project;


class Division {
    public Division() {
    }

    public int div1(int num1, int num2) {
        return num1 / num2;
    }

    public int div2(int num1, int num2) {
        return num1 / num2;
    }

    public long div3(int num1, int num2) {
        return num1 / num2;
    }


    public double div4(int num1, int num2) {
        double result;
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = Double.valueOf(num1) / Double.valueOf(num2);
        }
        return result;

    }
}