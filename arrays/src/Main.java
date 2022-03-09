public class Main {

    public static void main(String[] args) {

	    String[] students = new String[3];
        students[0] = "Melih";
        students[1] = "Mehmet Can";
        students[2] = "Eda";

        for(int i= 0; i< students.length;i++){
            System.out.println(students[i]);
        }
        for (String i:students){
            System.out.println(i);
        }
    }
}
