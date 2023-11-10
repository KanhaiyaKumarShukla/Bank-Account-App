package com.example.bankaccountapp

fun main(){
    val denisBankAccount=BankAccountDetail("Denis", 6765.00)
    println("${denisBankAccount.accountHolder}'s Account")
    denisBankAccount.deposit(765.00)
    denisBankAccount.withdraw(800.00)
    denisBankAccount.deposit(865.00)
    denisBankAccount.withdraw(7000.00)
    denisBankAccount.displayTransactionHistory()
    denisBankAccount.acctBalance()
    println("********************************")
    val sarahBankAccount=BankAccountDetail("Sarah", 0.0)
    println("${sarahBankAccount.accountHolder}'s Account")
    sarahBankAccount.deposit(100.00)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.00)
    sarahBankAccount.displayTransactionHistory()
    sarahBankAccount.acctBalance()

}