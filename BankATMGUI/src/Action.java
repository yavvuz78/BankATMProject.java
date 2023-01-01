import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Action {
    private List<String> actions;

    public Action() {
        this.actions =new ArrayList<>(Arrays.asList("1- Deposit Money", "2- Withdraw Money","3- Money Transfer","4- EXİT"));
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }
}
