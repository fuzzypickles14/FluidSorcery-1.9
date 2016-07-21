package com.fuzzypickles14.fluidsorcery.common.item;

import com.fuzzypickles14.fluidsorcery.common.item.items.GaleThread;
import com.fuzzypickles14.fluidsorcery.common.item.items.MistFibers;
import com.fuzzypickles14.fluidsorcery.common.item.items.ScorchedLeather;
import com.fuzzypickles14.fluidsorcery.common.item.items.ItemManual;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Andrew Toomey on 2/13/2016.
 */
public class ModItems {

    public static ItemManual itemManual;
    public static ScorchedLeather scorchLeather;
    public static GaleThread galeThread;
    public static MistFibers mistFibers;

    public static void initItems() {
        GameRegistry.register(itemManual = new ItemManual("ItemManual"));
        GameRegistry.register(scorchLeather = new ScorchedLeather("ItemScorchedLeather"));
        GameRegistry.register(galeThread = new GaleThread("ItemGaleThread"));
        GameRegistry.register(mistFibers = new MistFibers("ItemMistFibers"));
    }
}

