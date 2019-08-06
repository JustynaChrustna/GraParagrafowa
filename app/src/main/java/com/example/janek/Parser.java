package com.example.janek;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    private final String filePath;
    private List<Paragraf> paragrafList=new ArrayList<>();
    public List<Paragraf> getParagrafList() {
        return paragrafList;
    }
//="C:\\Users\\justyna\\AndroidStudioProjects\\GraParagrafowa\\src\\graParagrafowa.json"

    public Parser() {
        this.filePath="C:\\Users\\justyna\\AndroidStudioProjects\\GraParagrafowa\\app\\src\\main\\assets\\graParagrafowa.json";
    }
    public void parseJson(){

        try {
            JSONObject jsonObject=new JSONObject(filePath);
            JSONArray paragrafsArray= (JSONArray) jsonObject.get("paragrafs");
            for (int i = 0; i < paragrafsArray.length(); i++) {
                JSONObject paragraf= (JSONObject) paragrafsArray.getJSONObject(i);
                int paragrafNumber= ((Long) paragraf.get("paragrafNumber")).intValue();
                String paragrafContent= (String) paragraf.get("paragrafContent");
                JSONArray selectionList= (JSONArray) paragraf.get("selectionList");
                List<Selection> selectionListForParagraf=new ArrayList<>();
                for (int j = 0; j < selectionList.length(); j++) {
                    JSONObject selectionItem= (JSONObject) selectionList.get(j);
                    String selectionContent= (String) selectionItem.get("selectionContent");
                    int nextPar= ((Long) selectionItem.get("nextPar")).intValue();
                    Selection selection=new Selection(selectionContent, nextPar);
                    selectionListForParagraf.add(selection);
                }
                Paragraf ParagrafFromJSON= new Paragraf(paragrafNumber, paragrafContent, selectionListForParagraf);
                paragrafList.add(ParagrafFromJSON);
            }




        } catch (JSONException e) {
            e.printStackTrace();
        }

    }



}

