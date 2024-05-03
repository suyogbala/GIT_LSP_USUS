package org.howard.edu.lsp.oopfinal.question2;

//Concrete class for PayPal Payment
class PayPalPayment implements PaymentStrategy {
 private String emailAddress;

 public PayPalPayment(String emailAddress) {
     this.emailAddress = emailAddress;
 }

 @Override
 public void pay(double paisa) {
     System.out.println("Paid " + paisa + " using PayPal account " + emailAddress);
 }
}