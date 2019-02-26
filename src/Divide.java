import java.util.List;

public class Divide implements Calculate {
    @Override
    public int calculate(List<Integer> i) {
        int ans = i.get(0);
        for (int x:i) {
            ans /= x;
        }
        return ans;
    }
}
