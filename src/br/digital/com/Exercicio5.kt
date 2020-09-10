package br.digital.com

fun main(){

    val veiculo = Veiculo("marca", "modelo1", 2020, "cor", 1000.00)
    val cliente = Cliente("nome1", "sobrenome", "contato")
    //val concessionaria = Concessionaria()

    val venda = Concessionaria().registrarVenda(veiculo, cliente, 1000.00)
    println("Venda de ${venda.veiculo.modelo} a(o) cliente ${venda.cliente.nome} registrada com sucesso!")
}