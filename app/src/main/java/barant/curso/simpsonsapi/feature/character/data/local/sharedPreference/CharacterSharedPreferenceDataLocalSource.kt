package barant.curso.simpsonsapi.feature.character.data.local.sharedPreference

import barant.curso.simpsonsapi.core.error.ErrorApp
import barant.curso.simpsonsapi.feature.character.domain.Character

class CharacterSharedPreferenceDataLocalSource {
    val list: MutableList<Character> = mutableListOf(Character(1,"homer",25,"Hombre","15/5/2006","Nuclear","ldsjkf","asdkjf"))

    suspend fun getCharacter(): Result<List<Character>>{
        if (list.isEmpty()){
            return Result.failure(ErrorApp.DataEmptyErrorApp)
        }
        return Result.success(list)
    }
}