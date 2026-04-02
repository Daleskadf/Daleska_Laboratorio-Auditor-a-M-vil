package com.distriqt.extension.adverts.controller;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.distriqt.extension.adverts.utils.Errors;
import com.distriqt.extension.adverts.utils.Logger;
import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdvertViewParams {
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 5;
    public static final int ALIGN_LEFT = 3;
    public static final int ALIGN_NONE = 0;
    public static final int ALIGN_RIGHT = 4;
    public static final int ALIGN_TOP = 1;
    public static String TAG = "AdvertViewParams";
    public int height;
    public int horizontalAlign;
    public int verticalAlign;
    public int width;
    public int x;
    public int y;

    public static String alignmentToString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? SubscriptionPhase.RECURRENCE_MODE_NONE : "center" : "right" : "left" : "bottom" : "top";
    }

    public AdvertViewParams() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
        this.verticalAlign = 0;
        this.horizontalAlign = 0;
    }

    public AdvertViewParams(Rect rect, String str, String str2) {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
        this.verticalAlign = 0;
        this.horizontalAlign = 0;
        try {
            this.x = rect.left;
            this.y = rect.top;
            this.width = rect.right;
            this.height = rect.bottom;
            this.verticalAlign = alignmentFromString(str);
            this.horizontalAlign = alignmentFromString(str2);
        } catch (Exception e) {
            Logger.d(TAG, e.toString(), new Object[0]);
        }
    }

    public String toString() {
        return String.format(Locale.US, "(%d,%d) :: %dx%d [%d] [%d]", Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.verticalAlign), Integer.valueOf(this.horizontalAlign));
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", this.x);
            jSONObject.put("y", this.y);
            jSONObject.put("width", this.width);
            jSONObject.put("height", this.height);
            jSONObject.put("horizontalAlign", alignmentToString(this.horizontalAlign));
            jSONObject.put("verticalAlign", alignmentToString(this.verticalAlign));
        } catch (Exception e) {
            Errors.handleException(e);
        }
        return jSONObject;
    }

    public FrameLayout.LayoutParams toLayoutParams() {
        return toLayoutParams(-2, -2);
    }

    public FrameLayout.LayoutParams toLayoutParams(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.leftMargin = this.x;
        layoutParams.topMargin = this.y;
        int i3 = this.width;
        if (i3 > 0) {
            layoutParams.width = i3;
        }
        int i4 = this.height;
        if (i4 > 0) {
            layoutParams.height = i4;
        }
        layoutParams.gravity = 0;
        int i5 = this.horizontalAlign;
        if (i5 == 3) {
            layoutParams.gravity |= 3;
        } else if (i5 == 4) {
            layoutParams.gravity |= 5;
        } else if (i5 == 5) {
            layoutParams.gravity |= 1;
        }
        int i6 = this.verticalAlign;
        if (i6 == 1) {
            layoutParams.gravity |= 48;
        } else if (i6 == 2) {
            layoutParams.gravity |= 80;
        } else if (i6 == 5) {
            layoutParams.gravity |= 16;
        }
        return layoutParams;
    }

    public static int alignmentFromString(String str) {
        if (str.equals("top")) {
            return 1;
        }
        if (str.equals("bottom")) {
            return 2;
        }
        if (str.equals("center")) {
            return 5;
        }
        if (str.equals("left")) {
            return 3;
        }
        return str.equals("right") ? 4 : 0;
    }
}
