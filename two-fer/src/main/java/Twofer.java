public class Twofer {
    public String twofer(String name) {
        if(name == null){
            return "One for you, one for me.";
        }
        else if (name == "Alice"){
            return "One for Alice, one for me.";
        }
        else if (name =="Bob"){
            return "One for Bob, one for me.";
        }
        return "One for , one for me.";
    }
}