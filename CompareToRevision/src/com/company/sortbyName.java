package com.company;

import java.util.Comparator;

public class sortbyName implements Comparator<ChildBank> {
    @Override
    public int compare(ChildBank o1, ChildBank o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
