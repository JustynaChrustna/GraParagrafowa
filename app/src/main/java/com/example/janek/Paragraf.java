package com.example.janek;

import java.util.ArrayList;
import java.util.List;

public class Paragraf {
    private int paragrafNumber;
    private String paragrafContent;
    private List<Selection> selectionList=new ArrayList<Selection>();

    public int getParagrafNumber() {
        return paragrafNumber;
    }

    public String getParagrafContent() {
        return paragrafContent;
    }

    public List<Selection> getSelectionList() {
        return selectionList;
    }

    public Paragraf(int paragrafNumber, String paragrafContent, List<Selection> selectionList) {
        this.paragrafNumber = paragrafNumber;
        this.paragrafContent = paragrafContent;
        for (int i = 0; i < selectionList.size(); i++) {
            this.selectionList.add(selectionList.get(i));
        }




    }
}
