## Desafio Bootcamp-Santander 

<p>Criar um diagrama de classe de acordo com minha interpretação e implementá-lo em Java </p>

```plantuml
@startuml
interface ReprodutorMusical {
    + tocar(musica: String) : void
    + pausar(musica: String) : void
    + selecionarMusica(musica: String) : void
}

interface AparelhoTelefonico {
    + ligar(numero: String) : void
    + atender() : void
    + iniciarCorreioVoz() : void
}

interface NavegadorNaInternet {
    + exibirPagina(url: String) : void
    + adicionarNovaAba(novaUrl: String) : void
    + atualizarPagina() : void
}

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    - nome : String
    - numero : boolean
    - wifi : boolean
    
    + iPhone(nome: String, numero: boolean, wifi: boolean)
    + tocar(musica: String) : void
    + pausar(musica: String) : void
    + selecionarMusica(musica: String) : void
    + ligar(numero: String) : void
    + atender() : void
    + iniciarCorreioVoz() : void
    + exibirPagina(url: String) : void
    + adicionarNovaAba(novaUrl: String) : void
    + atualizarPagina() : void
    - censorTela() : void
    - verificarChip() : void
    - mostrarCapaAlbum() : void
}
@enduml

```
Diagrama UMl

