package week4;

import java.util.ArrayList;

public class Account {
  private double balance = 0;
  private ArrayList<Transaction> transitionList = new ArrayList<>();

  /**
   * Deposit.
   *
   * @param amount the amount
   */
  private void deposit(double amount) {
    if (amount < 0) {
      System.out.println("So tien ban nap vao khong hop le!");
    } else {
      this.balance += amount;
      Transaction newTrans = new Transaction(Transaction.DEPOSIT, amount, this.balance);
      transitionList.add(newTrans);
    }
  }

  /**
   * Withdraw.
   *
   * @param amount the amount
   */
  private void withdraw(double amount) {
    if (amount < 0) {
      System.out.println("So tien ban rut ra khong hop le!");
    } else if (amount > this.balance) {
      System.out.println("So tien ban rut vuot qua so du!");
    } else {
      this.balance -= amount;
      Transaction newTrans = new Transaction(Transaction.WITHDRAW, amount, this.balance);
      transitionList.add(newTrans);
    }
  }

  /**
   * Adds the transaction.
   *
   * @param amount the amount
   * @param operation the operation
   */
  public void addTransaction(double amount, String operation) {
    if (operation.equals(Transaction.DEPOSIT)) {
      deposit(amount);
    } else if (operation.equals(Transaction.WITHDRAW)) {
      withdraw(amount);
    } else {
      System.out.println("Yeu cau khong hop le!");
    }
  }

  /**
   * Prints the transaction.
   */
  public void printTransaction() {
    for (int i = 1; i <= transitionList.size(); i++) {
      if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
        System.out.println("Giao dich " + i + ": Nap tien $"
            + (Math.round(transitionList.get(i).getAmount() * 100.0) / 100.0) + ". So du luc nay: $"
            + (Math.round(transitionList.get(i).getBalance() * 100.0) / 100.0) + ".");
      }
      if (transitionList.get(i).getOperation().equals(Transaction.WITHDRAW)) {
        System.out.println("Giao dich " + i + ": Rut tien $"
            + (Math.round(transitionList.get(i).getAmount() * 100.0) / 100.0) + ". So du luc nay: $"
            + (Math.round(transitionList.get(i).getBalance() * 100.0) / 100.0) + ".");
      }
    }
  }
}
