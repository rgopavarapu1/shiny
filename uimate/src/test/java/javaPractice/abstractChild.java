package javaPractice;
public class abstractChild extends abstractParent{

    @Override
    public void doors() {

        System.out.println("Two doors");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'doors'");
    }

    @Override
    public void price() {
        // TODO Auto-generated method stub
        System.out.println("$25000");
        // throw new UnsupportedOperationException("Unimplemented method 'price'");
    }

    public static void main(String[] args) {
        abstractChild ac = new abstractChild();
        ac.doors();
        ac.price();

        ac.bodyStyle();
        ac.driveTrain();
        ac.engine();
        ac.wheels();
    }

}
