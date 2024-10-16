package lam.pam.architecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _inputText = MutableLiveData<String>()
    private val _transformedText = MutableLiveData<String>()

    // Expose inputText as LiveData
    val inputText: LiveData<String>
        get() = _inputText

    // Expose transformedText as LiveData
    val transformedText: LiveData<String>
        get() = _transformedText

    // Function to update input text and automatically transform it
    fun updateText(newText: String) {
        _inputText.value = newText
        // Update transformed text based on the new input text
        _transformedText.value = "Transformed: ${newText.uppercase()}"
    }
}
