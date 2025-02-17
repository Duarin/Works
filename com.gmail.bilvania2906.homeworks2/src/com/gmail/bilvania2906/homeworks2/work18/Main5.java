package com.gmail.bilvania2906.homeworks2.work18;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction(1, 100.0, "CREDIT", "SUCCESS"),
                new Transaction(2, 200.0, "DEBIT", "SUCCESS"),
                new Transaction(3, 50.0, "CREDIT", "FAILED"),
                new Transaction(4, 300.0, "DEBIT", "SUCCESS"),
                new Transaction(5, 150.0, "CREDIT", "SUCCESS"),
                new Transaction(6, 400.0, "DEBIT", "PENDING")
        );
        List<Transaction> successfulTransactions = transactions.stream()
                .filter(transaction -> transaction.getStatus().equals("SUCCESS"))
                .collect(Collectors.toList());

        Map<String, Double> totalAmounts= successfulTransactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getType,
                        Collectors.summingDouble(Transaction::getAmount)
                ));

        Optional<Transaction> largestCreditTransaction=successfulTransactions.stream()
                .filter(transaction -> transaction.getType().equals("CREDIT"))
                .max(Comparator.comparingDouble(Transaction::getAmount));

        System.out.println("Total CREDIT amount: "+totalAmounts.getOrDefault("CREDIT",0.0));
        System.out.println("Total DEBIT amount: " + totalAmounts.getOrDefault("DEBIT", 0.0));
        largestCreditTransaction.ifPresent(transaction ->
                System.out.println("Largest CREDIT transaction: " + transaction));
    }

    static class Transaction {
        private int id;
        private double amount;
        private String type;
        private String status;

        public Transaction(int id, double amount, String type, String status) {
            this.id = id;
            this.amount = amount;
            this.type = type;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public double getAmount() {
            return amount;
        }

        public String getType() {
            return type;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "id=" + id +
                    ", amount=" + amount +
                    ", type='" + type + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }
}
