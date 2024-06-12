import java.util.*; 
public class Session
{
    //Data
    private String ID;
    private String Name;
    private Date date;
    
    //Constructor
    public Session(String ID, String Name, Date date) {
        this.ID = ID;
        this.Name = Name;
        this.date = date;
    }
    
    //Methods
    public void SetID(String ID){
        this.ID = ID;
    }
    
    public void SetName(String Name){
        this.Name = Name;
    }
    
    public void SetDate(Date date){
        this.date = date;
    }
    
    public String GetID(){
        return ID;
    }
    
    public String GetName(){
        return Name;
    }
    
    public Date GetDate(){
        return date;
    }
}
