public class TestAirline {
    public static void main(String[] args) {
        Airline airline1 = new Airline("Vueling");
        Airline airline2 =new Airline("Santosssss");
        airline1.printName();
        airline2.printName();
        System.out.println(airline1.getBankAccount());
        airline1.setBankAccount(1000);
        System.out.println(airline1.getBankAccount());

        
    }
}
