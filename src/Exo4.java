public class Exo4 {
    public static class Customer {
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;
        private String dateOfBirth;
        private String address;

        public Customer(String firstName, String lastName, String phoneNumber, String email, String dateOfBirth, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.dateOfBirth = dateOfBirth;
            this.address = address;
        }

        // Getters and setters

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Account {
        private int accountNumber;
        private Customer customer;
        private double balance;

        public Account(int accountNumber, Customer customer) {
            this.accountNumber = accountNumber;
            this.customer = customer;
            this.balance = 0.0;
        }

        public void credit(double amount) {
            balance += amount;
        }

        public void debit(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }

        public void transferToAccount(Account target, double amount) {
            if (balance >= amount) {
                debit(amount);
                target.credit(amount);
            } else {
                System.out.println("Insufficient funds for transfer");
            }
        }

        // Getters and setters

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    public static class AccountTest {
        public static void main(String[] args) {
            // Create a customer
            Customer customer = new Customer("Joro", "Sullivan", "1234567890", "jorosullivan13@gmail.com", "2023-01-13", "501 Toamasina");

            // Create an account for the customer
            Account account = new Account(123456, customer);

            // Test credit method
            account.credit(100.0);
            System.out.println("Account balance after credit: " + account.getBalance());

            // Test debit method
            account.debit(50.0);
            System.out.println("Account balance after debit: " + account.getBalance());

            // Test transferToAccount method
            Account targetAccount = new Account(654321, customer);
            account.transferToAccount(targetAccount, 25.0);
            System.out.println("Account balance after transfer: " + account.getBalance());
        }
    }

}
