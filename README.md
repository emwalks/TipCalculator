# TipCalculator

App Project 3: Android Basics in Kotlin Course

This repo keeps track of my progress following the [Android Basics in Kotlin Course](https://developer.android.com/courses/android-basics-kotlin/course)

## Techniques implemented & Learning

- [EditText](https://developer.android.com/reference/kotlin/android/widget/EditText) - for entering and editing text
- Hints for placeholder text in EditText
- [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView) - to display text like the service question and tip amount
- [RadioButton](https://developer.android.com/guide/topics/ui/controls/radiobutton#kotlin) - a selectable radio button for each tip option
- [RadioGroup](https://developer.android.com/reference/android/widget/RadioGroup) - to group the radio button options
- CheckedButton on a RadioGroup to add a default option
- [Switch](https://developer.android.com/reference/kotlin/android/widget/Switch) - an on/off toggle for choosing whether to round up the tip or not
- Using android:checked to set switches on or off by default
- [Constraint Layout](https://developer.android.com/training/constraint-layout)
- Using match constraint (0dp) instead of match parent for UI elements in a ConstraintLAyout
- Supporting [Dark Theme](https://developer.android.com/guide/topics/ui/look-and-feel/darktheme) - now appears to be included in res/values/themes.xml by default
- Extracting UI text to string resources for easier translation
- [View Binding](https://developer.android.com/topic/libraries/view-binding) instead of using findViewById()
- Using checkedRadioButtonId to identify user selection
- Appending %s to strings in strings.xml to allow concatenation
- Using Locale.getDefault() to format currency
- Updating app icon using background and foreground xml
- Using Material Design components [Text Fields](https://material.io/components/text-fields/android)
- Backwards compatibility of [Vector Drawables](https://developer.android.com/guide/topics/graphics/vector-drawable-resources?authuser=1#vector-drawables-backward-solution)
- Using styles.xml to style multiple elements
- Scroll View for improved landscape experience
- Using [onKeyListeners](https://developer.android.com/reference/kotlin/android/view/View?authuser=1#setOnKeyListener(android.view.View.OnKeyListener)) and the [Input Method Manager](https://developer.android.com/reference/android/view/inputmethod/InputMethodManager) to dismiss the on screen keyboard after clicking enter
- Applying app theme colours as tints to vector drawable objects for improved dark mode experience

<!--
<img align="right" src="https://github.com/emwalks/TipCalculator/blob/main/app/src/main/res/drawable/app_preview_light.png" alt="appPreviewLight" width="300"/>
-->

<img src="https://github.com/emwalks/TipCalculator/blob/main/app/src/main/res/drawable/app_preview_light.png" alt="appPreviewLight" width="300"/>
<img src="https://github.com/emwalks/TipCalculator/blob/main/app/src/main/res/drawable/app_preview_dark.png" alt="appPreviewLight" width="300"/>


