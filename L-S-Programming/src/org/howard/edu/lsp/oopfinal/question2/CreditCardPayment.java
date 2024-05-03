package org.howard.edu.lsp.oopfinal.question2;

//Concrete class for Credit Card Payment
class CreditCardPayment implements PaymentStrategy {
 private String creditCardNumber;

 public CreditCardPayment(String creditCardNumber) {
     this.creditCardNumber = creditCardNumber;
 }

 @Override
 public void pay(double paisa) {
     System.out.println("Paid " + paisa + " using credit card " + creditCardNumber);
 }
}
