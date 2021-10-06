public class Airline {
    private String name;
    private Integer bankAccount;

    public Airline( String initName){
        name = initName;
        bankAccount = 8000000;
    }

    public void printName(){
        System.out.println(name);
    }
    public Integer getBankAccount(){
        return bankAccount;
    }
    public void setBankAccount( Integer newbankacc){
        bankAccount= newbankacc;    
    }
}
