import java.util.Comparator;

// Компаратор, который сравнивает экземпляры класса IncomingCall по длительности звонка

public class CompOnDuration implements Comparator<IncomingCall> {
    @Override
    public int compare(IncomingCall o1, IncomingCall o2) { // переопределяем метод compare в соответствии с заданной целью
        if (o1.getDuration() != o2.getDuration()) return o1.getDuration() - o2.getDuration();
        else return 1;
    }
}
