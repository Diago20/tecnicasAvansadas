package com.example.calculadora;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.num7), withText("7"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.plus), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                3),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.num8), withText("8"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        1),
                                1),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                4),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.ac), withText("ac"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        2),
                                0),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.num5), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        1),
                                2),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.min), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                2),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.num2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        1),
                                3),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                4),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.times), withText("X"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                1),
                        isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.num9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        2),
                                1),
                        isDisplayed()));
        appCompatButton11.perform(click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                4),
                        isDisplayed()));
        appCompatButton12.perform(click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.div), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                0),
                        isDisplayed()));
        appCompatButton13.perform(click());

        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.num4), withText("4"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton14.perform(click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                4),
                        isDisplayed()));
        appCompatButton15.perform(click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.ac), withText("ac"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        2),
                                0),
                        isDisplayed()));
        appCompatButton16.perform(click());

        ViewInteraction appCompatButton17 = onView(
                allOf(withId(R.id.num7), withText("7"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        0),
                                1),
                        isDisplayed()));
        appCompatButton17.perform(click());

        ViewInteraction appCompatButton18 = onView(
                allOf(withId(R.id.ser), withText("!"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        0),
                                0),
                        isDisplayed()));
        appCompatButton18.perform(click());

        ViewInteraction appCompatButton19 = onView(
                allOf(withId(R.id.equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                4),
                        isDisplayed()));
        appCompatButton19.perform(click());

        ViewInteraction appCompatButton20 = onView(
                allOf(withId(R.id.ac), withText("ac"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        2),
                                0),
                        isDisplayed()));
        appCompatButton20.perform(click());

        ViewInteraction appCompatButton21 = onView(
                allOf(withId(R.id.num8), withText("8"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        1),
                                1),
                        isDisplayed()));
        appCompatButton21.perform(click());

        ViewInteraction appCompatButton22 = onView(
                allOf(withId(R.id.F), withText("F"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        1),
                                0),
                        isDisplayed()));
        appCompatButton22.perform(click());

        ViewInteraction appCompatButton23 = onView(
                allOf(withId(R.id.equal), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                4),
                        isDisplayed()));
        appCompatButton23.perform(click());

        ViewInteraction appCompatButton24 = onView(
                allOf(withId(R.id.siguiente), withText("sig"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        3),
                                5),
                        isDisplayed()));
        appCompatButton24.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.etPeso),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("35"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.etBase),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("1.5"), closeSoftKeyboard());

        ViewInteraction appCompatCheckBox = onView(
                allOf(withId(R.id.cbFemenino), withText("Femenino"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatCheckBox.perform(click());



        ViewInteraction appCompatButton25 = onView(
                allOf(withId(R.id.btIMC), withText("IMC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton25.perform(click());

        ViewInteraction appCompatButton26 = onView(
                allOf(withId(R.id.btPesoIdeal), withText("Peso Ideal"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton26.perform(click());

        ViewInteraction appCompatButton27 = onView(
                allOf(withId(R.id.btBorrar), withText("Borrar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton27.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.etPeso),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("48"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.etBase),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("1.7"), closeSoftKeyboard());

        ViewInteraction appCompatCheckBox2 = onView(
                allOf(withId(R.id.cbMasculino), withText("Masculino"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatCheckBox2.perform(click());



        ViewInteraction appCompatButton28 = onView(
                allOf(withId(R.id.btIMC), withText("IMC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                10),
                        isDisplayed()));
        appCompatButton28.perform(click());

        ViewInteraction appCompatButton29 = onView(
                allOf(withId(R.id.btPesoIdeal), withText("Peso Ideal"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton29.perform(click());

        ViewInteraction appCompatButton30 = onView(
                allOf(withId(R.id.btBorrar), withText("Borrar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                11),
                        isDisplayed()));
        appCompatButton30.perform(click());

        ViewInteraction appCompatButton31 = onView(
                allOf(withId(R.id.btCalcularIMC), withText("Calculadora Area"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                13),
                        isDisplayed()));
        appCompatButton31.perform(click());

        ViewInteraction appCompatRadioButton = onView(
                allOf(withId(R.id.rbCuadrado), withText("Cuadrado"),
                        childAtPosition(
                                allOf(withId(R.id.rgContenedor),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatRadioButton.perform(click());

        ViewInteraction appCompatButton32 = onView(
                allOf(withId(R.id.btSeleccionar), withText("Seleccionar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton32.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.etAltura),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("34"), closeSoftKeyboard());

        ViewInteraction appCompatButton33 = onView(
                allOf(withId(R.id.btCalcular), withText("Calcular"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton33.perform(click());



        ViewInteraction appCompatButton34 = onView(
                allOf(withId(R.id.btVolver), withText("Volver"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton34.perform(click());

        ViewInteraction appCompatRadioButton2 = onView(
                allOf(withId(R.id.rbCirculo), withText("Circulo"),
                        childAtPosition(
                                allOf(withId(R.id.rgContenedor),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                2)),
                                1),
                        isDisplayed()));
        appCompatRadioButton2.perform(click());

        ViewInteraction appCompatButton35 = onView(
                allOf(withId(R.id.btSeleccionar), withText("Seleccionar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton35.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.etRadio),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("65"), closeSoftKeyboard());

        ViewInteraction appCompatButton36 = onView(
                allOf(withId(R.id.btCalcular), withText("Calcular"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton36.perform(click());



        ViewInteraction appCompatButton37 = onView(
                allOf(withId(R.id.btVolver), withText("Volver"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton37.perform(click());

        ViewInteraction appCompatRadioButton3 = onView(
                allOf(withId(R.id.rbRectangulo), withText("Rectangulo"),
                        childAtPosition(
                                allOf(withId(R.id.rgContenedor),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                2)),
                                2),
                        isDisplayed()));
        appCompatRadioButton3.perform(click());

        ViewInteraction appCompatButton38 = onView(
                allOf(withId(R.id.btSeleccionar), withText("Seleccionar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton38.perform(click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.etBase),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("34"), closeSoftKeyboard());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.etAltura),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatEditText8.perform(replaceText("50"), closeSoftKeyboard());

        ViewInteraction appCompatButton39 = onView(
                allOf(withId(R.id.btCalcular), withText("Calcular"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton39.perform(click());



        ViewInteraction appCompatButton40 = onView(
                allOf(withId(R.id.btVolver), withText("Volver"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                9),
                        isDisplayed()));
        appCompatButton40.perform(click());

        ViewInteraction appCompatRadioButton4 = onView(
                allOf(withId(R.id.rbTriangulo), withText("Triangulo"),
                        childAtPosition(
                                allOf(withId(R.id.rgContenedor),
                                        childAtPosition(
                                                withClassName(is("androidx.constraintlayout.widget.ConstraintLayout")),
                                                2)),
                                3),
                        isDisplayed()));
        appCompatRadioButton4.perform(click());

        ViewInteraction appCompatButton41 = onView(
                allOf(withId(R.id.btSeleccionar), withText("Seleccionar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton41.perform(click());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.etBase),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText9.perform(replaceText("4"), closeSoftKeyboard());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.etAltura),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText10.perform(replaceText("8"), closeSoftKeyboard());

        ViewInteraction appCompatButton42 = onView(
                allOf(withId(R.id.btCalcular), withText("Calcular"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton42.perform(click());



        ViewInteraction appCompatButton43 = onView(
                allOf(withId(R.id.btVolver), withText("Volver"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        appCompatButton43.perform(click());

        ViewInteraction appCompatButton44 = onView(
                allOf(withId(R.id.btCalcularIMC), withText("Calculadora IMC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton44.perform(click());

        ViewInteraction appCompatButton45 = onView(
                allOf(withId(R.id.btCalculadora), withText("Calculadora"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                12),
                        isDisplayed()));
        appCompatButton45.perform(click());

        ViewInteraction appCompatButton46 = onView(
                allOf(withId(R.id.anterior), withText("ant"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.nums),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton46.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
