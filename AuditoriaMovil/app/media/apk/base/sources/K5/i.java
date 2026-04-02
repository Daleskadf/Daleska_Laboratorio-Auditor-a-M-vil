package K5;
/* loaded from: classes.dex */
public enum i {
    STANDARD(null),
    LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
    MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
    HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
    SELECTION_CLICK("HapticFeedbackType.selectionClick");
    
    private final String encodedName;

    i(String str) {
        this.encodedName = str;
    }

    public static i a(String str) {
        i[] values;
        for (i iVar : values()) {
            String str2 = iVar.encodedName;
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return iVar;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such HapticFeedbackType: ", str));
    }
}
