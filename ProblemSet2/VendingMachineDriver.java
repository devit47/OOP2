package ProblemSet2;

public class VendingMachineDriver{
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.setCans(1);
        vm.setTokens(10);
        vm.buyCan();
        vm.buyCan();

        VendingMachine argsVM = new VendingMachine(12, 12);
        argsVM.buyCan();
        argsVM.buyCan();

        System.out.println("\nSummary:\n" + vm.toString() + "\n\n" + argsVM.toString());
    }
}