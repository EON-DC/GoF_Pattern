package fasade;

public class Message {
    private Row row;

    public Message(Row row) {
        this.row = row;
    }

    public String makeName(){
        return "Name : \"" + row.getName() + "\"";
    }

    public String makeBirthDay(){
        return "BirthDay : \"" + row.getBirthday() + "\"";
    }

    public String makeEmail(){
        return "Email : \"" + row.getEmail() + "\"";
    }
}
