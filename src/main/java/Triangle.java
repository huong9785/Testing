public class Triangle {
    public static String classifyTheTriangle(int a, int b, int c) {
        if (a <= 0 || a > 100 || b <= 0 || b > 100 || c <= 0 || c > 100) {
            return "Invalid error";
        }
        if (a >= b + c || b >= a + c || c >= a + b) {
            return "Not a triangle";
        }
        if (a * a == b * b + c * c
                || b * b == a * a + c * c
                || c * c == a * a + b * b) {
            if (a == b || b == c || c == a) {
                return "Isosceles right triangle";
            } else {
                return "Right triangle";
            }
        }
        if (a == b && b == c) {
            return "Equilateral triangle";
        }
        if (a == b || b == c || c == a) {
            return "Isosceles triangle";
        }
        return "Triangle";
    }
}
