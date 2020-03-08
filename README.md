# DesafioCompra

Configuração:

 - Utilizado o projeto Maven, linguagem JAVA, framework Selenium Webdriver e JUnit para o desenvolvimento dos scripts de teste.
 - Criado 5 pacotes (tests, pages, utils, suporte, suites) para separar a classes.
     - Tests - Contém classe de teste que será executado.
     - Pages - Contém classes com as páginas a serem interagidas no teste.
     - Utils - Contém classes para tirar o screenshot, gerar a data e horário atual, bem como gerar números randômicos para inserir em alguns campos no teste.
     - Suporte - Contém classes para escolher em qual navegador a ser utilizado bem como as classes BasePage e BaseTest a serem explicados mais abaixo.
     - Suites - Contém a suíte que ordena a execução das classes de teste.

Obs:
     As classes pages extendem a classe BasePage onde contém toda a lógica de interação dos elementos na página Web, exemplo: escrever nos campos, clicar nos botões, selecionar combos, obter os textos para validação etc.
     A classe test extende a classe BaseTest onde contém o screenchot ao final de cada execução do teste.

Obs: 
     Usar o chromedriver versão 80. Configurado no PATCH na variáveis de ambiente do Windows. Se optar por outro navegador é só configurar na variáveis de ambiente e na classe Propriedades, alterar para o navegador desejado, FIREFOX ou IE.


Execução:

 - Compilar com JUnit as classes CompraTest ou SuiteTeste para execução do teste.
