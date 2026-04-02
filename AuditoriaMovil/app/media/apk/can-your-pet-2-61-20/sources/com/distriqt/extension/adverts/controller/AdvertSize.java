package com.distriqt.extension.adverts.controller;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdvertSize {
    public int height;
    public int heightInPixels;
    public String type;
    public int width;
    public int widthInPixels;

    public JSONObject toJSON() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.width);
        jSONObject.put("height", this.height);
        jSONObject.put("type", this.type);
        jSONObject.put("widthInPixels", this.widthInPixels);
        jSONObject.put("heightInPixels", this.heightInPixels);
        return jSONObject;
    }
}
