import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Test {
    Set<String> set_color = new HashSet<>(List.of("blue", "green", "black", "write", "yelow"));

    public void operate_in_Set(){
        set_color.add("gray");// insert a element in set
        String collect = String.join("-", set_color);
        System.out.println(collect);
        set_color.add("green");//don't insert this element, because already exist 
        collect = String.join("-", set_color);
        System.out.println(collect);
        
    }
}
