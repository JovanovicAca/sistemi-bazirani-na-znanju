package com.example.EuroTraveler.facts;

import java.util.List;

public class Wrapper {

    private List<Response> list;

    public Wrapper(List<Response> list) {
        this.list = list;
    }

    public List<Response> getList() {
        return list;
    }

    public void setList(List<Response> list) {
        this.list = list;
    }
}
