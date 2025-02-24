public class StudentMarks {
    static String name="Nagesh";
    static int marks=30;
    static String subject="maths";
    static char gender='M';
    static void addextraMarks(){
        System.out.println(name+" "+(marks+10)+" "+subject+" "+gender);
    }
    public static void main(String [] args){
        addextraMarks();
    }

}
