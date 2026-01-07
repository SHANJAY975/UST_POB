import com.ust.Milestone_1.Largest_then_shortest_order;
import java.util.HashMap;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
//    int []arr = {0, -4, 9, 1, -2, 6, 3};
//    Largest_then_shortest_order obj = new Largest_then_shortest_order(6, arr);
//    arr = obj.answer();
//    for(int ele: arr){
//        System.out.println(ele);
//    }
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo");  // Duplicate
    capitalCities.put("USA", "Washington DC");
    Collections.sort(capitalCities, Collections.reverseOrder());
    System.out.println(capitalCities);
}
