package K5;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final String f2758a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2759b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2760c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2761d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2762e;

    public z(String str, int i7, int i8, int i9, int i10) {
        if ((i7 == -1 && i8 == -1) || (i7 >= 0 && i8 >= 0)) {
            if ((i9 == -1 && i10 == -1) || (i9 >= 0 && i9 <= i10)) {
                if (i10 <= str.length()) {
                    if (i7 <= str.length()) {
                        if (i8 <= str.length()) {
                            this.f2758a = str;
                            this.f2759b = i7;
                            this.f2760c = i8;
                            this.f2761d = i9;
                            this.f2762e = i10;
                            return;
                        }
                        throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i8));
                    }
                    throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i7));
                }
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i9));
            }
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i9) + ", " + String.valueOf(i10) + ")");
        }
        throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i7) + ", " + String.valueOf(i8) + ")");
    }

    public static z a(JSONObject jSONObject) {
        return new z(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
