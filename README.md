# Exercício 2 da AF
Vetores A e B

## Algoritmo do Exercício

    INÍCIO
        VAR 
        x <- 0
        c <- 0
        a: cadeia
        b: cadeia

        x <- x + 1
        A[4,6,7,1,0]
        B[7,1,3,1,2]

        vetorA[] = new int[5]
        vetorB[] = new int[5]
 
        PARA x = 0, x <- 5, x = x + 1) 
            ESCREVA ("Valor A: "), FAÇA
            LEIA vetorA[x]
            ESCREVA ("Valor B: "), FAÇA 
            LEIA vetorB[x]
        FIM PARA
        PARA x = 0, x <- 4, x = x + 1)
            c = c + (vetorA[x] * vetorB[x])
        FIMPARA
        EXIBIR(c)
    FIM

## Fluxograma
<img src="fluxo_ex2.png" alt="">