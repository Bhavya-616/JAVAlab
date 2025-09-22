class TypePromotion {
    void d(int a, double b) {
        System.out.println("Method A");
    }

    void display(double a, int b, double c) {
        System.out.println("Method B");
    }

    public static void main(String[] args) {
        TypePromotion obj = new TypePromotion();
        obj.d(10, 20.5); 
        obj.display(10.5, 20, 30.5); 
    }
}

