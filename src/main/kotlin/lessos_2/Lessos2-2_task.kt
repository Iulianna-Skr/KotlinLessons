package org.example.lessos_2

fun main() {
    // кол-во постоянных сотрудников
    val permanentEmployees = 50;
    // зарплата постоянных сотрудников
    val salaryOfPermanentEmployees = 30000;

    // кол-во новых сотрудников
    val newEmployees = 30;
    // ЗП новых сотрудников
    val salaryOfNewEmployees = 20000;

    // Расходы на выплату зарплаты постоянных сотдрудников
    val salaryOfPermanentExpenses = permanentEmployees * salaryOfPermanentEmployees;

    // Расходы на выплату зарплаты новых сотрудников
    val salaryOfNewExpenses = newEmployees * salaryOfNewEmployees;

    // Общие расходы по ЗП после прихода стажеров
    val salaryExpenses = salaryOfPermanentExpenses + salaryOfNewExpenses;

    //кол-во общих сотрудников
    val employess = permanentEmployees + newEmployees;

    //Средняя ЗП одного сотрудника
    val averageSalary = salaryExpenses / employess;

    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryOfPermanentExpenses рублей");

    println("Общие расходы по ЗП после приходы стажеров: $salaryExpenses рублей");

    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary рублей");

}