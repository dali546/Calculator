import java.util.List;

public class Add implements Calculate {
    @Override
    public int calculate(List<Integer> i) {
        int ans = 0;
        for (int x:i) {
            ans += x;
        }
        return ans;
    }
}
