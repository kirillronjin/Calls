import java.util.TreeSet;

// Тут создадим несколько экземпляров класса IncomingCall (входящий звонок)
// и покажем работоспособность сортировки звонков по различным параметрам

public class Main {
    public static void main(String[] args) {

        // Создание экземпляров класса IncomingCall

        IncomingCall incCall1 = new IncomingCall(
                1,
                5,
                20,
                "79969260513",
                13,
                999,
                9,
                13,
                "Problem 1",
                10);
        IncomingCall incCall2 = new IncomingCall(
                2,
                5,
                20,
                "79969260513",
                500,
                999,
                9,
                13,
                "Problem 2",
                8);
        IncomingCall incCall3 = new IncomingCall(
                3,
                10,
                100,
                "79807476170",
                80,
                500,
                4,
                8,
                "Problem 3",
                1);
        IncomingCall incCall4 = new IncomingCall(
                4,
                0,
                12,
                "79038296159",
                120,
                312,
                8,
                8,
                "Problem 4",
                3);
        IncomingCall incCall5 = new IncomingCall(
                5,
                1232,
                1340,
                "79807476168",
                198,
                5200,
                9,
                12,
                "Problem 5",
                3);

        IncomingCall incCall6 = new IncomingCall(incCall1); // Проверяю работоспособность конструктора копирования
        incCall1.setTime_start(0);
        System.out.println(incCall1);
        System.out.println(incCall6);

        System.out.println();

        CompOnDifficult compOnDifficult = new CompOnDifficult(); // Создаём экземпляр компаратора по сложности
        CompOnDecisionTime compOnDecisionTime = new CompOnDecisionTime(); // Создаём экземпляр компаратора по времени решения
        CompOnDuration compOnDuration = new CompOnDuration(); // Создаём экземпляр компаратора по длительности звонка
        TreeSet<IncomingCall> incomingCalls1 = new TreeSet<>(compOnDifficult); // Создаем TreeSet с параметром - экземпляром компаратора по сложности
        TreeSet<IncomingCall> incomingCalls2 = new TreeSet<>(compOnDecisionTime); // Создаем TreeSet с параметром - экземпляром компаратора по времени решения
        TreeSet<IncomingCall> incomingCalls3 = new TreeSet<>(compOnDuration); // Создаем TreeSet с параметром - экземпляром компаратора по длительности звонка

        // Добавляем элементы в incomingCalls1
        incomingCalls1.add(incCall1);
        incomingCalls1.add(incCall2);
        incomingCalls1.add(incCall3);
        incomingCalls1.add(incCall4);
        incomingCalls1.add(incCall5);

        for (IncomingCall call : incomingCalls1) { // Вывод элементов TreeSet'а
            System.out.println(call);
        }

        System.out.println();

        // Добавляем элементы в incomingCalls2
        incomingCalls2.add(incCall1);
        incomingCalls2.add(incCall2);
        incomingCalls2.add(incCall3);
        incomingCalls2.add(incCall4);
        incomingCalls2.add(incCall5);

        for (IncomingCall call : incomingCalls2) { // Вывод элементов TreeSet'а
            System.out.println(call);
        }

        System.out.println();

        // Добавляем элементы в incomingCalls3
        incomingCalls3.add(incCall1);
        incomingCalls3.add(incCall2);
        incomingCalls3.add(incCall3);
        incomingCalls3.add(incCall4);
        incomingCalls3.add(incCall5);

        for (IncomingCall call : incomingCalls3) { // Вывод элементов TreeSet'а
            System.out.println(call);
        }




    }
}
