package com.ciscoadiz;

import java.util.Objects;

public class MyText {
    private String text;

    public MyText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean contains(MyText words) {
        return text.contains(words.getText());
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyText)) return false;
        MyText myText = (MyText) o;
        return Objects.equals(text, myText.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

}
