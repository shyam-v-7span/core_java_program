import java.util.Hashtable;

public class StudentHashtable {
    public static void main(String[] args) {

        Hashtable<Integer,String> student = new Hashtable<>();

        student.put(1, "shyam");
        student.put(2, "xyz");
        student.put(3, "abc");
        student.put(4, "hello");
        student.put(5, "john");
        student.put(6, "utsav");
        
        System.out.println(student);

        int searchId = 1;
        if (student.containsKey(searchId)) {
            System.out.println("student found : " + student.get(searchId));
        } else {
            System.out.println("roll no not exist");
        } 
        
        int removeId = 2;
        if (student.containsKey(removeId)) {
            student.remove(removeId);
            System.out.println("roll no. " + removeId + " removed successfully.");
        } else {
            System.out.println("student not exist");
        }

        int AddId = 2;
        String name = "shyam";
    
        if (student.containsKey(AddId)) {
            System.out.println("already exist student");
        }
        else{
            student.put(AddId, name);
            System.out.println("student added sucessfully");
        }

        System.out.println("all students:");
        // for (int key : student.keySet()) {
        //     System.out.println("roll no : " + key + ", name: " + student.get(key));
        // }
        
        student.forEach((key, value) -> System.out.println("roll no: " + key + ", Name: " + value));
    }
}
