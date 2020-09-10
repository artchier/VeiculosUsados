package br.digital.com

class Concessionaria {

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double): Venda{
        return Venda(cliente, veiculo, valor)
    }
}