package barant.curso.simpsonsapi.feature.character.domain

interface CharacterRepository {
    suspend fun getCharacter(): Result<List<Character>>
}