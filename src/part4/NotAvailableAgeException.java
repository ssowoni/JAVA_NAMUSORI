package part4;

public class NotAvailableAgeException  extends Exception{

    public NotAvailableAgeException() {
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}
