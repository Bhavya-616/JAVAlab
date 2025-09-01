class lecture {
    float marks = 98.5f;
    static String Home = "Paradis";
    void Rumbling(){
        String name = "Eren Yeager";
    }
}

class practice3 {
    public static void main (String[] args){
        lecture obj = new lecture();
        System.out.println(obj.marks);
        System.out.println(lecture.Home);
        // System.out.println(obj.name); // Error: Cannot access non-static variable 'name' from static context
    }
}