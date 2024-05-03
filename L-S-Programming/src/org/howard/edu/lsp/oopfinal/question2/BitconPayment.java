package org.howard.edu.lsp.oopfinal.question2;

//Concrete class for Bitcoin Payment
class BitcoinPayment implements PaymentStrategy {
 private String bitcoinAddress;

 public BitcoinPayment(String bitcoinAddress) {
     this.bitcoinAddress = bitcoinAddress;
 }

 @Override
 public void pay(double paisa) {
     System.out.println("Paid " + paisa + " using Bitcoin address " + bitcoinAddress);
 }
}
