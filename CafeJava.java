public class CafeJava {
    public static void main(String[] args){
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.05;
        double lattePrice = 4.3;
        double cappuccinoPrice = 5.45;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        System.out.println(generalGreeting + customer1);

        // Cindhuri's order status
        System.out.println(customer1 + pendingMessage);

        // Noah's order status
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        
        // Sam's order
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println(displayTotalMessage + cappuccinoPrice*2);

        // Jimmy's order
        System.out.println(customer3);
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));

    }
}