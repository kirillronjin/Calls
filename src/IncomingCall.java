import java.util.Comparator;
import java.util.Objects;

// IncomingCall - класс для входящих звонков

public class IncomingCall extends Call {

    private String phone_number; // Номер телефона звонящего
    private int decision_time; // Время решения проблемы
    private int operator_id; // ID оператора
    private int client_mark; // Оценка действий оператора клиентом
    private int problem_class; // Класс проблемы
    private String problem_description; // Описание проблемы
    private int difficult; // Сложность

    public IncomingCall() { // Конструктор без параметров
        super(); // Инициализация элемента родительского класса
    }

    public IncomingCall(int call_id, // Конструктор с параметрами
                int time_start,
                int time_end,
                String phone_number,
                int decision_time,
                int operator_id,
                int client_mark,
                int problem_class,
                String problem_description,
                int difficult) {
        super(call_id, time_start, time_end); // Инициализация элемента родительского класса
        this.phone_number = phone_number;
        this.difficult = difficult;
        this.decision_time = decision_time;
        this.operator_id = operator_id;
        this.client_mark = client_mark;
        this.problem_class = problem_class;
        this.problem_description = problem_description;
    }

    public IncomingCall(IncomingCall incomingCall) { // Конструктор копирования
        super(incomingCall.call_id, incomingCall.time_start, incomingCall.time_end); // Инициализация элемента родительского класса
        this.phone_number = incomingCall.phone_number;
        this.difficult = incomingCall.difficult;
        this.decision_time = incomingCall.decision_time;
        this.operator_id = incomingCall.operator_id;
        this.client_mark = incomingCall.client_mark;
        this.problem_class = incomingCall.problem_class;
        this.problem_description = incomingCall.problem_description;
    }

    // Секция сеттеров и геттеров

    public int getDecision_time() {
        return decision_time;
    }

    public void setDecision_time(int decision_time) {
        this.decision_time = decision_time;
    }

    public int getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(int operator_id) {
        this.operator_id = operator_id;
    }

    public int getClient_mark() {
        return client_mark;
    }

    public void setClient_mark(int client_mark) {
        this.client_mark = client_mark;
    }

    public int getProblem_class() {
        return problem_class;
    }

    public void setProblem_class(int problem_class) {
        this.problem_class = problem_class;
    }

    public String getProblem_description() {
        return problem_description;
    }

    public void setProblem_description(String problem_description) {
        this.problem_description = problem_description;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() { // Переопределил метод toString для лучшего вывода информации об экземпляре класса
        return "InputCall{" +
                "call_id=" + call_id +
                ", time_start=" + time_start +
                ", time_end=" + time_end +
                ", duration=" + duration +
                ", phone_number='" + phone_number + '\'' +
                ", decision_time=" + decision_time +
                ", operator_id=" + operator_id +
                ", client_mark=" + client_mark +
                ", problem_class=" + problem_class +
                ", problem_description='" + problem_description + '\'' +
                ", difficult=" + difficult +
                '}';
    }


}
