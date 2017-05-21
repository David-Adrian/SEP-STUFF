package domain.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by romietis on 5/13/17.
 */
public class Message {
    private Date date;
    private String text;
    private User user;
    private int msgId;

    public Message(String text, User user, int msgId, Date date){
        this.text = text;
        this.user = user;
        this.msgId = msgId;
        this.date = date;
    }
    public Message(String text, User user){
        this.text = text;
        this.user = user;
        this.date = new Date();
        this.msgId = generateMsgId();
    }

    public int generateMsgId(){
        Random r = new Random();
        return (int) (100000 + r.nextFloat()*900000);
    }
    public String getText(){
        return  text;
    }
    public int getMsgId(){
        return msgId;
    }
    public Date getDate(){
        return date;
    }
    public String getTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }

    public User getUser(){
        return user;
    }

    public String toString(){
        String s = getUser() + " :" + getText() + " " + getMsgId() + " " + getTimestamp();
        return s;
    }
}
