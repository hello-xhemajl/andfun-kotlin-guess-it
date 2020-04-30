package com.example.android.guesstheword.screens.game

import androidx.lifecycle.ViewModel
import timber.log.Timber

class GameViewModel : ViewModel(){

    init {
        Timber.i("CREATED. GameViewModel was created")
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("CLEARED. GameViewModel onCleared() was called")
    }
}