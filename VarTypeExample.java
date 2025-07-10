public class VarTypeExample {
    int instanceVar = 10;
    static int staticVar = 20;

    public void displayVariables(){
        int localVar = 30;

        System.out.println("Instance Variable: "+ instanceVar);
        System.out.println("Static Variable: "+ staticVar);
        System.out.println("Local Variable: "+ localVar);
    }
    
    public static void main(String[] args){
        VarTypeExample example = new VarTypeExample();
        example.displayVariables();
    }
}
