public class StudentInfo {
    static String nameOfStudent="Nagesh";
    static int marks=45;
    static String course="science";
    static char gender='M';
    static void addExtraMarks(){
        System.out.println(nameOfStudent+","+(marks+5)+","+course+","+gender);
    }
    public static void main(String [] args){
        addExtraMarks();
    }
}
