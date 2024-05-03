package org.howard.edu.lsp.oopfinal.question2;

//Concrete class for PayPal Payment
class PayPalPayment implements PaymentStrategy {
 private String emailAddress;

 public PayPalPayment(String emailAddress) {
     this.emailAddress = emailAddress;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Paid " + amount + " using PayPal account " + emailAddress);
 }
}