import java.util.Comparator;

// Компаратор, который сравнивает экземпляры класса IncomingCall по времени решения

public class CompOnDecisionTime implements Comparator<IncomingCall> {
    @Override
    public int compare(IncomingCall o1, IncomingCall o2) { // переопределяем метод compare в соответствии с заданной целью
        if (o1.getDecision_time() != o2.getDecision_time()) return o1.getDecision_time() - o2.getDecision_time();
        else return 1;
    }
}
