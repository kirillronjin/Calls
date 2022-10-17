// Абстрактный класс Call необходим для того, чтобы от него наследовались классы IncomingCall (входящий звонок)
// и InternalCall (внутренний звонок - звонок внутри предприятия)

public abstract class Call {
    protected int call_id; // Номер звонка
    protected int time_start; // Время начала звонка
    protected int time_end; // Время окончания звонка
    protected int duration; // Длительность звонка

    public Call(){} // Конструктор без параметров

    public Call(int call_id, int time_start, int time_end) { // Конструктор с параметрами
        this.call_id = call_id;
        this.time_start = time_start;
        this.time_end = time_end;
        this.duration = this.time_end - this.time_start;
    }

    public Call(Call call) { // Конструктор с параметрами
        this.call_id = call.call_id;
        this.time_start = call.time_start;
        this.time_end = call.time_end;
        this.duration = call.duration;
    }

    public int getCall_id() {
        return call_id;
    }

    public void setCall_id(int call_id) {
        this.call_id = call_id;
    }

    public int getTime_start() {
        return time_start;
    }

    public void setTime_start(int time_start) {
        this.time_start = time_start;
        this.setDuration(this.time_end -this.time_start);
    }

    public int getTime_end() {
        return time_end;
    }

    public void setTime_end(int time_end) {
        this.time_end = time_end;
        this.setDuration(this.time_end -this.time_start);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
