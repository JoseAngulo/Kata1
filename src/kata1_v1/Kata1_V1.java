package kata1_v1;

import java.util.Date;

public class Kata1_V1 {
    
    public static void main(String[] args) {
        Person yo = new Person("Jose",new Date(96,4,30));
        
        System.out.println(yo.getName()+" tiene"+" "+yo.getAge()+" años");
        
    }
}
