package Queue;

import java.util.LinkedList;

public class NumberOfRecentCalls_933 {
    LinkedList<Integer> slideWindow;

    public NumberOfRecentCalls_933() {
        this.slideWindow = new LinkedList<Integer>();
    }

    public int ping(int t) {
        this.slideWindow.addLast(t);

        while(slideWindow.getFirst() < t - 3000) {
            slideWindow.removeFirst();
        }
        return slideWindow.size();


    }
}
