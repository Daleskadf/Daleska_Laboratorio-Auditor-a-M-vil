package K5;
/* loaded from: classes.dex */
public enum l {
    TOP_OVERLAYS("SystemUiOverlay.top"),
    BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
    
    private String encodedName;

    l(String str) {
        this.encodedName = str;
    }

    public static l a(String str) {
        l[] values;
        for (l lVar : values()) {
            if (lVar.encodedName.equals(str)) {
                return lVar;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such SystemUiOverlay: ", str));
    }
}
