package com.example.bankaccountapp

class BankAccountDetail(var accountHolder:String, var balance:Double) {
    private val transactionHistory= mutableListOf<String>()
     fun deposit(amount:Double){
         balance+=amount
         transactionHistory.add("$amount is deposited , current balance is $balance")
     }
    fun withdraw(amount:Double){
        if(amount<=balance){
            balance-=amount
            transactionHistory.add("$amount is withdrawed, current balance is $balance")
        }else {
            println("No sufficient balance")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction History:")
        for(item in transactionHistory){
            println(item)
        }
    }
    fun acctBalance(){
        println("Balance: $balance")
    }
}