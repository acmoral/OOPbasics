class Main{
    public static void main(String[] args) {
       System.out.println("hola mundo"); 
       UberX uberX = new UberX("AMQ123",new Account("Andrea","1018"),"Yamaha","f2.0");
       uberX.setPassenger(4);
       uberX.printDataCar();
    }
}