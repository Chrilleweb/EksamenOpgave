import java.time.LocalDate;
import java.util.concurrent.ExecutionException;

public class Ticket {
    private String eventName;
    private LocalDate date;
    private boolean isUsed;

    public Ticket(String eventName, LocalDate date, boolean isUsed){
        this.eventName = eventName;
        this.date = date;
        this.isUsed = isUsed;
    }

    public void use() throws Exception {
        if (!isUsed){
            System.out.println("Already used");
            isUsed = true;
        } if (isUsed){
            Exception exception = new Exception();
            throw exception;
        }
    }

    public static void main(String[] args) throws Exception {
        Ticket ticket = new Ticket("Name", LocalDate.of(2020, 10, 12), false);

        try {
            ticket.use();
            ticket.use();
        } catch (Exception e){
            System.out.println("Fail");
        }


    }
}
