public class Bank_Accounts {

    public Bank_Accounts(double  balance, double apr) {
    }

    protected boolean getBalance() {
        return getBalance();
    }

    public String getInterest_rate() {
        return getInterest_rate();

    }

    public String getNumber_withdrawals() {
        return null;
    }

    public String getNumber_deposit() {
        return null;
    }

    public  abstract   class BankAccount {

        private  double Balance;
        private double Number_dep;
        private double number_with;
        private double interest_rate;
        protected  double servicce_charges;
        public double getBalance(){
            return Balance;
        }
        public void setBalance(double balance){
            this.Balance = balance;
        }
        public double getNumber_deposit(){
            return Number_dep;
        }

        public double getNumber_withdrawals() {
            return number_with;

        }
        public double getInterest_rate(){
            return  interest_rate;
        }

        public BankAccount(double balance , double apr){
            this.Balance = balance;
            this.interest_rate=apr;
        }
        private  void depoist(double amount){
            this.Balance += amount;
            this.Number_dep++;
        }
        void withdraw(double amount){
            this.Balance -= amount;
            this.number_with++;
        }

        public  void  calcInterest(){
            double monthlyInterest = (interest_rate /12 );
            monthlyInterest = Balance * monthlyInterest;
            this.Balance += monthlyInterest;
        }
        public  void monthlyprocess(){
            this.Balance -= servicce_charges;
            calcInterest();

            this.Number_dep = 0;
            this .number_with = 0;
            this.servicce_charges = 0;
        }


        protected void deposit(double amount) {
        }
    }
}
