package barant.curso.simpsonsapi.feature.character.domain

import android.util.Log

class GetCharacterUseCase(private val repository: CharacterRepository) {
    suspend fun getCaracter(): Result<List<Character>>{
        Log.d("@dev",repository.getCharacter().toString())
        return repository.getCharacter()
    }
}