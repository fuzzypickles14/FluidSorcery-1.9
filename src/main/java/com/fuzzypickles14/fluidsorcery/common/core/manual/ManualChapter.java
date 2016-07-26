package com.fuzzypickles14.fluidsorcery.common.core.manual;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Andrew Toomey on 7/25/2016.
 */
public class ManualChapter
{
    private ArrayList<ManualPage> ChapterPages;
    private String name;
    public ManualChapter(String name,  ManualPage... Pages)
    {
        this.name = name;
        this.ChapterPages = new ArrayList<ManualPage>();
        Collections.addAll(this.ChapterPages, Pages);
    }

    public ArrayList<ManualPage> getChapterPages() {
        return this.ChapterPages;
    }

    public String getName() {
        return this.name;
    }
}
