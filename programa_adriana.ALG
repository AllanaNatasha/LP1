Algoritmo "semnome"

Var
   sub, x, api, p1, en1, en2, exf,m1, m2, max1, max2, a, nota, nota_total: real


Inicio
   escreva ("Prova1: ")
   leia (p1)
   escreva ("Entrega E1: ")
   leia (en1)
   escreva ("Entrega E2: ")
   leia (en2)
   escreva ("Prova substitutiva: ")
   leia (sub)
   escreva ("API: ")
   leia (api)
   escreva ("Atividade extra: ")
   leia (x)



   m1 <- p1 * 0.5 + en1 * 0.2 + en2 * 0.3 + x + (sub * 0.15)
   se (m1 > 5.9) entao
      a <- api * 0.5
   senao
      a <- 0
   fimse

   nota_total <- (m1 * 0.5) + a
   se (nota_total < 6) entao
      escreval ("O aluno ficou de exame, digite a nota: ")
      leia (exf)
   fimse
   se (nota_total > exf) entao
      nota <- nota_total
   senao
      nota <- exf
   fimse

   escreval ("A nota final é: ", nota:2:2)
Fimalgoritmo