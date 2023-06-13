package Message

class Message(nomUtilisateur: String) {
    public val nomUtilisateur = nomUtilisateur
    public fun presentation(){
        println("Hello, My name is ${nomUtilisateur}")
    }
}