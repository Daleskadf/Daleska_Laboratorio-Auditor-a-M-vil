package K5;
/* loaded from: classes.dex */
public enum A {
    TEXT("TextInputType.text"),
    DATETIME("TextInputType.datetime"),
    NAME("TextInputType.name"),
    POSTAL_ADDRESS("TextInputType.address"),
    NUMBER("TextInputType.number"),
    PHONE("TextInputType.phone"),
    MULTILINE("TextInputType.multiline"),
    EMAIL_ADDRESS("TextInputType.emailAddress"),
    URL("TextInputType.url"),
    VISIBLE_PASSWORD("TextInputType.visiblePassword"),
    NONE("TextInputType.none"),
    WEB_SEARCH("TextInputType.webSearch"),
    TWITTER("TextInputType.twitter");
    
    private final String encodedName;

    A(String str) {
        this.encodedName = str;
    }

    public static A a(String str) {
        A[] values;
        for (A a7 : values()) {
            if (a7.encodedName.equals(str)) {
                return a7;
            }
        }
        throw new NoSuchFieldException(io.flutter.plugins.pathprovider.b.h("No such TextInputType: ", str));
    }
}
