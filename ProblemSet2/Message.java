package ProblemSet2;

public class Message{
    private String recipient, sender, messageText;

    public Message(){
        this("Empty", "Empty");
    }

    public Message(String recipient, String sender){
        this.recipient = recipient;
        this.sender = sender;
    }

    public void append(String messageText){
        this.messageText += messageText;
    }

    public String getRecipient(){
        return recipient;
    }
    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public String getSender(){
        return sender;
    }
    public void setSender(String sender){
        this.sender = sender;
    }

    public String getMessageText(){
        return messageText;
    }
    public void setMessageText(String messageText){
        this.messageText = messageText;
    }

    public String toString(){
        return  "From: " + getSender() + "\nTo: " + getRecipient() + "\n" + getMessageText();
    }
}