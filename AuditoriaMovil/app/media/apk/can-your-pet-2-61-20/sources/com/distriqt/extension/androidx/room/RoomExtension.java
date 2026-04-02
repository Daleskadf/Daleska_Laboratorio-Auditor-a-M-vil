package com.distriqt.extension.androidx.room;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
/* loaded from: classes.dex */
public class RoomExtension implements FREExtension {
    public static String ID = "androidx.room";
    public static RoomContext context;

    @Override // com.adobe.fre.FREExtension
    public void initialize() {
    }

    @Override // com.adobe.fre.FREExtension
    public FREContext createContext(String str) {
        RoomContext roomContext = new RoomContext();
        context = roomContext;
        return roomContext;
    }

    @Override // com.adobe.fre.FREExtension
    public void dispose() {
        context = null;
    }
}
