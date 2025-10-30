package barant.curso.simpsonsapi.core

sealed class ErrorApp : Throwable(){
    object InternetConnectionErrorApp : ErrorApp()
    object SocketTimeoutErrorApp : ErrorApp()
    object HttpErrorApp : ErrorApp()
    object ServerErrorApp : ErrorApp()
    object JsonDataErrorApp : ErrorApp()
    object EmptyErrorApp : ErrorApp()
    object UnknownErrorApp : ErrorApp()
}