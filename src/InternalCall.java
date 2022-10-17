// InternalCall - класс для звонков внутри предприятия

public class InternalCall extends Call {


    private int callerId;
    private int calledId;

    public InternalCall() { // Конструктор без параметров
        super(); // Инициализация родительского класса
    }

    public InternalCall(int call_id, // Конструктор с параметрами
                      int time_start,
                      int time_end,
                        int callerId,
                        int calledId) {
        super(call_id, time_start, time_end); // Инициализация элемента родительского класса
        this.callerId = callerId;
        this.calledId = calledId;
    }

    public InternalCall(InternalCall internalCall) { // Конструктор копирования
        super(internalCall.call_id, internalCall.time_start, internalCall.time_end); // Инициализация элемента родительского класса
        this.callerId = internalCall.callerId;
        this.calledId = internalCall.calledId;
    }

    public int getCallerId() {
        return callerId;
    }

    public void setCallerId(int callerId) {
        this.callerId = callerId;
    }

    public int getCalledId() {
        return calledId;
    }

    public void setCalledId(int calledId) {
        this.calledId = calledId;
    }
}
