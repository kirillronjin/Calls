import java.util.Comparator;

// Компаратор, который сравнивает экземпляры класса IncomingCall по сложности

public class CompOnDifficult implements Comparator<IncomingCall> {
    @Override
    public int compare(IncomingCall o1, IncomingCall o2) { // переопределяем метод compare в соответствии с заданной целью
        if (o1.getDifficult() != o2.getDifficult()) return o1.getDifficult() - o2.getDifficult();
        else return 1;
    }
}
