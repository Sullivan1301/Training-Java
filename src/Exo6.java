import java.util.ArrayList;
import java.util.List;

public class Exo6 {
    public static class SavingsAccount extends Exo4.Account {
        private final double interest; // Taux d'intérêt pour le compte épargne

        public SavingsAccount(int accountNumber, Exo4.Customer customer, double interest) {
            super(accountNumber, customer);
            this.interest = interest;
        }

        public void applyInterest() {
            double interestAmount = getBalance() * (interest / 100); // Calcul du montant d'intérêt
            credit(interestAmount); // Ajout du montant d'intérêt au solde du compte
        }
    }

    public static class CurrentAccount extends Exo4.Account {
        private double overdraftLimit; // Limite de découvert autorisé pour le compte courant

        public CurrentAccount(int accountNumber, Exo4.Customer customer, double overdraftLimit) {
            super(accountNumber, customer);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void debit(double amount) {
            if (getBalance() - amount >= -overdraftLimit) { // Vérification de la limite de découvert autorisé
                super.debit(amount); // Débit du montant spécifié du compte
            } else {
                System.out.println("Exceeded overdraft limit"); // Affichage d'un message d'erreur si la limite est dépassée
            }
        }
    }

}
