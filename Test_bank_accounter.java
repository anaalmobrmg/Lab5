public class Test_bank_accounter {


        public static void main(String[] args) {

             BankAccounter a = new BankAccounter ();
            a.Deposit_Bank( 2250);

            System.out.println(a.getBalance());
            a.withraw(300);
            a.withraw(250);
            System.out.print(a.getBalance() );
            System.out.print("$");

        }




}
