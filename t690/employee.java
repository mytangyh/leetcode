import java.util.ArrayList;
import java.util.List;

public class employee {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        
    }

    public int getImportance(List<Employee> employees, int id) {
        int sum=0;
        for (Employee e : employees) {
            if(e.id==id){
                if (e.subordinates.size()==0) {
                    sum=e.importance;
                    return sum;
                }
                for (int subid : e.subordinates) {
                    e.importance+=getImportance(employees, subid);
                }
                return e.importance;
            }
            
        }
        
       
        return 0;
        
    }

}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};