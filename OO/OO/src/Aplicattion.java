

class Aplicattion {
    
    public static void main(String[] args){

        Cartest car1 = new Cartest();

        car1.setColor("Blue");
        car1.setModel("Mercedes");
        car1.setTankCapacity(45);

        System.out.println(car1.getModel());
        System.out.println((car1.getColor()));
        System.out.println(car1.getTankCapacity());
        System.out.println(car1.totalTank(6.8));

    }
}
