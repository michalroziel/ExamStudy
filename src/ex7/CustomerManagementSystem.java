package ex7;

import java.beans.Customizer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CustomerManagementSystem {

    Queue<CustomerRequest> requests ;

    public CustomerManagementSystem(){
        this.requests = new LinkedList<>();
    }



    public void addRequest(CustomerRequest request){
        if(request != null){
            requests.add(request);
        }
    }

    public CustomerRequest processNextRequest(){
       return requests.poll();
    }

    public CustomerRequest peekNextRequest(){
        return requests.peek();
    }

    public int getQueueSize(){
        return requests.size();
    }


}
