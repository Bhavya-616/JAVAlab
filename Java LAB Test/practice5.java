class lecture5 {
    void subject(int a, int b){
        System.out.println(a+b);
    }
}
class practice5 {
    public static void main (String[] args){
        lecture5 obj = new lecture5();
        obj.subject(5, 10);
    }
}