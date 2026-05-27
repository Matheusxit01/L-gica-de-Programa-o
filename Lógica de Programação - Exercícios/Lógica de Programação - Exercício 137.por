programa {
  funcao inicio() {
    inteiro equipes = 6, partidas = 5
    inteiro soma, maior = 0, numeroEquipe
   inteiro matriz[equipes][partidas]
    inteiro totalEquipe[equipes]
   para(inteiro i = 0; i < equipes; i++) {
    escreva("Equipe ", i+1, "\n\n")
    
    soma = 0
    
    para(inteiro j = 0; j < partidas; j++) {
      escreva( j+1, "ª pontuação: ")
     leia(matriz[i][j])
     soma += matriz[i][j]
    }
      totalEquipe[i] = soma
     }
   } 
  }
