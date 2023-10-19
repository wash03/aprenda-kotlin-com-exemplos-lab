// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Aluno(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Aluno>()
    
    fun matricular(vararg alunos: Aluno) {
        inscritos.addAll(alunos)

    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 120)
    val conteudo2 = ConteudoEducacional("Algoritmos Avançados", 90)

    val formacao = Formacao("Ciência da Computação", Nivel.AVANCADO, listOf(conteudo1, conteudo2))

    val aluno1 = Aluno("João")
    val aluno2 = Aluno("Maria")

    formacao.matricular(aluno1, aluno2)
    
    println("Conteúdos da formação ${formacao.nome}:")
    for (conteudo in formacao.conteudos) {
        println("- ${conteudo.nome}")
    }

    println("\nInscritos na formação ${formacao.nome}:")
    for (aluno in formacao.inscritos) {
        println("- ${aluno.nome}")
    }
}