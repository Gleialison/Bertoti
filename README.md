EXERCICIO-1
COMENTARIOS SOBRE O LIVRO
# Bertoti Pasta Engenharia SW
11/08/23(Exercicio 1) (Livro Engenharia Google)
Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

Engenharia de software se divide em três pilares : tempo, escala e o conflito de escolha.
Cria o software fácil de interagir com tempo útil para não haver gastos desnecessário e melhor performance.
Escala e a distribuição de acesso para muitas pessoas, sendo acessado pelas mesma tendo visibilidade de maior número de pessoas.
Última coisa e trade off e jogo de perde ganha, você acaba ganhando em um ponto e acabar perdendo em outro, para da melhor equilíbrio nesse jogo, ganha no que você pode e perder na menos importante.
Requisitos funcionais são as ações do sistema são espresso como verbos.
Não funcionais, qualidade adjetivo.

EXERCICIO-2
TRADE-OFFS
14/08/23 (Exercicio 2) (Trade OFF)
Exemplos de Trade Offs (requisitos nao funcionais)
Citar as vantagens e desvantagens na utilizalçao da linguagem Python
Vantagens:
Linguagem de facil leitura, escrita, aprendizagem
Linguagem interpretada
Melhor produtividade
Declaração de variaveis

EXERCICIO-3
Desvantagens:
Erro de execução
Acesso ao banco de dados
Utilização de excessivo de memoria
Baixa velocidade de processamento

Cite um exemplo de trade offs no dia a dia (WhatApp)
Requisitos nao funionais: Envio de anexos, Notificacoes, registro unico de usuario

Requisitos funcionais: Tecnologias envolvidas, processamento, conexao, consumo de memoria

EXERCICO-4
REQUISITOS FUNIONAIS
18/08/2023 (Exercicio 3) (Requisitos nao funcionais)
Encontre um erro e um acerto de cada heuristica e coloque no seu readme.MD do Github

#1 Visibilidade do Status do Sistema
Acerto: Entrada do windons
Erro: whatsapp (status)

#2 Correspondencia entre o sistema e o mundo real
Acerto: Metafora do windons (janela, arquivo, lixeira)
Erro: SQL exeception para user 

#3 Controle e liberdade do usuario
Acerto: Word (undo / redo)
Erro: 

#4: Consistência e padrões
Acerto: WhatsApp
Erro: Siga

#5: Prevenção de erros
Acerto:
Erro:

#6: Reconhecimento em vez de lembrança
Acerto:
Erro:

#7: Flexibilidade e eficiência de uso
Acerto: Atalhos
Erro:

#8: Design estético e minimalista
Acerto: 
Erro:

#9: Ajude os usuários a reconhecer, diagnosticar e se recuperar de erros
Acerto:
Erro:

#10: Ajuda e documentação
Acerto:
Erro: 

EXERCICIO-5
DIAGRAMA DE CASO DE USO
25/08/23 (Exercicio 4) (Caso de Uso UML)
Slide 23
Salvo em Power Point


Nome da classe: Substantivo com a primeira letra maiúscula, exemplo (Sala, Aula, Aluno).
Oque a classe faz “verbo” exemplo (buscar, procurar, etc.)
"String é uma classe"

Atributo: É oque a classe conhece, substantivo com a primeira letra minúscula.
(-) Metodo privado
(+) Metodo publico (public)
Acesso, nome, parametro e o retorno

public list <Aluno> buscar Aluno Nome(String nome) {

	list <Aluno> encontrado = new Linha List <Aluno> ( );
	
	for(Aluno aluno: lista Chamada) {

	if(aluno.get Nome( )equals(nome))	

                	encontrados.add (aluno);
}

return encontrados;

}

EXERCICO-6
DIAGRAMA CLASSES UML
28/08/23 (Exercicio 5) (Classes UML)


EXERCICO-7
TESTE - FUNCÃO
22/09/23
Função (int a)
	b = a + // deveria ser a-1
	c = b / 30000
	return c 

- Considere apenas inteiro de - 32567 a  + 32568 
- Quais entradas mostram defeitos ?
	R:  -29999, 29999, 30000, -30000 

- É possível testar tudo ?
	R: Não

- Oque fazer? R: Usar técnica de testes Técnica de teste : Analise de valor limite  Exemplo: Como a divisão é por 30000, em teste os limites do valor
 
Técnica de testes
Exemplo: Classes de equivalência
(0 a 15 anos,  Não efetuo o contrato)
(16 a 17 anos, Aprendiz)
(18 a 100 anos, CLT)

NOTA:
Lembrando que o JUnit não resolve “Testar” software. Ele só automatiza.
Para testar você precisa de técnica de teste.


























