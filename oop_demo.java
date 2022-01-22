
class Student{
    int stud_id;
    String name;

    void insertStudnet(int s_id, String s_name){
        stud_id = s_id;
        name = s_name;
    }

    void printStudent(){
        System.out.print("Student Record :[ " + stud_id + "] [" + name+ "]" );
    }
}

    class oop_demo{

      
        public static void main(String [] args){
            Student s1 = new Student();
            Student s2 = new Student();
            
            //add student record to student class
            s1.insertStudnet(1001, "Paolo"); 
            s2.insertStudnet(1002, "Brent");

            //print student record
            s1.printStudent();
            s2.printStudent();
        }
    }