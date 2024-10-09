package javaPractice;
public class carChild implements carInterface{

    public static void main(String[] args) {
        carChild cc = new carChild();
        System.out.println("Car Specs");
        cc.bodyStyle();
        cc.wheels();
        cc.engine();
        cc.doors();
        cc.color();

        
    }

    @Override
    public void wheels() {
        // TODO Auto-generated method stub
        System.out.println("\tFour wheels");
        // throw new UnsupportedOperationException("Unimplemented method 'wheels'");
    }

    @Override
    public void doors() {
        // TODO Auto-generated method stub
        System.out.println("\tFour Doors");
        // throw new UnsupportedOperationException("Unimplemented method 'doors'");
    }

    @Override
    public void engine() {
        // TODO Auto-generated method stub
        System.out.println("\tCVT-4");
        // throw new UnsupportedOperationException("Unimplemented method 'engine'");
    }

    @Override
    public void bodyStyle() {
        // TODO Auto-generated method stub
        System.out.println("\tSedan");
        // throw new UnsupportedOperationException("Unimplemented method 'bodyStyle'");
    }

    public void color() {
        System.out.println("\tRed");
    }

}
