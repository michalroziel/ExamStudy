package ex7;

public class CustomerRequest implements Comparable<CustomerRequest> {

    private int requestId ;
    private String customerName;
    private String requestDetail;

    public String getPriority() {
        return priority;
    }

    private String priority;

    public CustomerRequest( int givenId, String givenname, String details, String prority){
        this.requestId = givenId;
        this.customerName = givenname;
        this.requestDetail = details;
        this.priority = prority;
    }


    @Override
    public int compareTo(CustomerRequest o) {

        return getPrioHelper(this.getPriority()) - getPrioHelper(o.getPriority());
    }

    public int getPrioHelper(String prio){

        return switch (prio) {
            case "hoch" -> 1;
            case "mittel" -> 2;
            case "niedrig" -> 3;
            default -> 0;
        };


    }


}
