programa {
  funcao inicio() {
    inteiro alunos = 4, notas = 3

    inteiro matriz[alunos][notas]

    para(inteiro i = 0; i < alunos; i++) {
      escreva("Nota ", i+1, "\n\n")

      para(inteiro j = 0; j < notas;j++) {
        escreva("Iforme a " , j+1, "ª nota: ")
        leia(matriz[i][j])
      }
    } 
    para(inteiro i = 0; i < alunos; i++) {
      escreva("Nota ", i+1, ": ")
      para(inteiro j = 0; j < notas; j++) {
        escreva("[", matriz[i][j], "] ")
      }
      escreva("\n")
    }
  }
}
