package S6;
/* loaded from: classes.dex */
public enum d {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");
    
    private final String lineSeparator;

    d(String str) {
        this.lineSeparator = str;
    }
}
