package utils;

import java.util.ArrayList;

public class FizzBuzzList {
    ArrayList<FizzBuzzText> list;

    public FizzBuzzList() {
        this.list = new ArrayList<>();
    }

    public ArrayList<FizzBuzzText> getList() {
        return list;
    }

    public void add(FizzBuzzText text){
        list.add(text);
    }

    public int size(){
        return list.size();
    }

    @Override
    public String toString() {
        return list + "";

    }
}
