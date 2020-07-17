package com.company;

import java.util.Comparator;

public class sortbyAge implements Comparator<ChildBank> {

    @Override
    public int compare(ChildBank o1, ChildBank o2) {
        return o1.getAge()-o2.getAge();
    }
}
