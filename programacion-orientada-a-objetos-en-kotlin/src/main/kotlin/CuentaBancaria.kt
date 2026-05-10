package edu.etec.ds.fundamentos

class CuentaBancaria(
    val titular: String,
    var saldo: Double = 0.0
) {
    fun depositar(monto: Double) {
        if (monto > 0) {
            saldo += monto
        }
    }

    fun retirar(monto: Double): Boolean {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto
            return true
        }
        return false
    }
}