package cl.libros

import java.util.*
import kotlin.system.exitProcess

/*
Marca de bicicletas (toma dos)
nombre de canciones con la palabra lluvia
Jugadores de futbol de seleccion chilena (de todos los tiempos) (toma 2)
programas de tv con H
Gentilicios de Chile
Artistas presentados en el Festival de Viña (toma 2)
Personajes Chavo del 8 (toma 2)
Nombres terminados en S
Personajes de Condorito (toma 2)
Dibujos animados en blanco y negro
Raza de perros (toma 2)
Palabras tecnicas de Java
Super heroes sin capa
Nombre animales propios de Chile
Peliculas Chilenas (toma 2)
Planetas del Sistema Solar
Personaje de los Simpson (toma 2)
Cuenta regresiva desde el 15 de uno en uno hasta el 0

 */


val pregunta1 = Preguntas("marca de bicicletas", CastigoDos())
val pregunta2 = Preguntas("nombre de canciones con la palabra lluvia", CastigoUno())
val pregunta3 = Preguntas(
    "Jugadores de futbol de seleccion chilena (de todos los tiempos)",
    CastigoDos()
)
val pregunta4 = Preguntas("programas de tv con H", CastigoUno())
val pregunta5 = Preguntas("Gentilicios de Chile", CastigoUno())
val pregunta6 = Preguntas("Artistas presentados en el Festival de Viña", CastigoDos())
val pregunta7 = Preguntas("Personajes Chavo del 8 ", CastigoDos())
val pregunta8 = Preguntas("Nombres terminados en S", CastigoUno())
val pregunta9 = Preguntas("Personajes de Condorito", CastigoDos())
val pregunta10 = Preguntas("Obras audiovisuales en blanco y negro ", CastigoUno())
val pregunta11 = Preguntas("Raza de perros", CastigoDos())
val pregunta12 = Preguntas("Palabras tecnicas de Java", CastigoUno())
val pregunta13 = Preguntas("Super heroes sin capa", CastigoUno())
val pregunta14 = Preguntas("Nombre animales propios de Chile", CastigoUno())
val pregunta15 = Preguntas("Peliculas Chilenas", CastigoDos())
val pregunta16 = Preguntas("Planetas del Sistema Solar", CastigoUno())
val pregunta17 = Preguntas("Personaje de los Simpson", CastigoDos())
val pregunta18 = Preguntas("Cuenta regresiva desde el 15 de uno en uno hasta el 0", CastigoUno())

val listaDePreguntas = listOf(
    pregunta1,
    pregunta2,
    pregunta3,
    pregunta4,
    pregunta5,
    pregunta6,
    pregunta7,
    pregunta8,
    pregunta9,
    pregunta10,
    pregunta11,
    pregunta12,
    pregunta13,
    pregunta14,
    pregunta15,
    pregunta16,
    pregunta17,
    pregunta18
)

fun main() {

    val scanner = Scanner(System.`in`)
    var continuar=true

    while (continuar) {
        val scannerResult = scanner.nextLine()
        if (scannerResult.equals("n")) {
            println("siguiente pregunta")

            val pregunta = listaDePreguntas.shuffled().get(0)

            println(pregunta.nombrePregunta)
            println("el castigo es ${pregunta.castigo}" )
        } else  {
            println("saliendo")
        break


        }
    }
}

