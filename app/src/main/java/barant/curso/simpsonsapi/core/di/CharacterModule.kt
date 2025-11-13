package barant.curso.simpsonsapi.core.di

import barant.curso.simpsonsapi.feature.character.data.CharacterDataSourceRepository
import barant.curso.simpsonsapi.feature.character.data.local.room.CharacterRoomDataLocalSource
import barant.curso.simpsonsapi.feature.character.data.local.sharedPreference.CharacterSharedPreferenceDataLocalSource
import barant.curso.simpsonsapi.feature.character.data.remote.api.CharacterApiDataRemoteSource
import barant.curso.simpsonsapi.feature.character.domain.CharacterRepository
import barant.curso.simpsonsapi.feature.character.domain.GetCharacterUseCase
import org.koin.dsl.module

val characterModule = module {
    single { CharacterSharedPreferenceDataLocalSource() }
    single { CharacterRoomDataLocalSource() }
    single { CharacterApiDataRemoteSource() }
    single <CharacterRepository>{ CharacterDataSourceRepository(get(),get(),get()) }
    factory { GetCharacterUseCase(get()) }
}