package cl.libros

//Juego cultura chupistica
//Listado preguntas random ligadas a multiples respuestas (ej: capitales del mundo)
//Preguntas:
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

data class Preguntas (val nombrePregunta: String, val castigo: Castigo)
sealed class Castigo
class CastigoUno: Castigo() {
    override fun toString(): String {
        return "toma 1"

    }

}
class CastigoDos: Castigo(){
override fun toString(): String {
    return "toma 2"
}
}

