public class Test_add_bank {



        public static void main(String[] args) {

            addBankAcoount momsSaving = new addBankAcoount(1000);
            momsSaving.deposit(5000);
            momsSaving.withraw(1000);

            momsSaving.addlnteresr(0.01);

            System.out.println( momsSaving.getBalance());
            momsSaving.withraw(5000);
            momsSaving.withraw(1000);

            System.out.println(momsSaving.getBalance() );
        }

}
