import java.util.List;

public class Multiply implements Calculate {
    @Override
    public int calculate(List<Integer> i) {
        int ans =1 ;
        for (int x:i) {
            ans *= x;
        }
        return ans;
    }
}
