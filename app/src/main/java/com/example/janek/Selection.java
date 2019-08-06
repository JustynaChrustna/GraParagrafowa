package com.example.janek;

public class Selection {
    private String selectionContent;
    private int nextPar;

    public Selection(String selectionContent, int nextPar) {
        this.selectionContent = selectionContent;
        this.nextPar = nextPar;
    }

    public String getSelectionContent() {
        return selectionContent;
    }

    public int getNextPar() {
        return nextPar;
    }
}
