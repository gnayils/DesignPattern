package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;


/**
 * Allows loose coupling by encapsulating the way disparate sets of objects interact and
 * communicate with each other. Allows for the actions of each object set to vary independently
 * of one another.
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }
}
