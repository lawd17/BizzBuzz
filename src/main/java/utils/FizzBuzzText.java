package utils;

import java.util.Objects;

public class FizzBuzzText {
    String text;

    public FizzBuzzText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean contains(String findword){
        return  text.contains(findword);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FizzBuzzText text1 = (FizzBuzzText) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return text;
    }
}
