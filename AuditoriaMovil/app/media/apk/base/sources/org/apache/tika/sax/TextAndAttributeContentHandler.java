package org.apache.tika.sax;

import org.apache.tika.utils.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
/* loaded from: classes.dex */
public class TextAndAttributeContentHandler extends TextContentHandler {
    public TextAndAttributeContentHandler(ContentHandler contentHandler) {
        this(contentHandler, false);
    }

    @Override // org.apache.tika.sax.TextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        super.startElement(str, str2, str3, attributes);
        int length = attributes.getLength();
        if (length > 0) {
            String trim = str2.trim();
            char[] charArray = (trim + StringUtils.SPACE).toCharArray();
            characters(charArray, 0, charArray.length);
            for (int i7 = 0; i7 < length; i7++) {
                String trim2 = attributes.getLocalName(i7).trim();
                char[] charArray2 = (trim2 + StringUtils.SPACE).toCharArray();
                String trim3 = attributes.getValue(i7).trim();
                char[] charArray3 = (trim3 + StringUtils.SPACE).toCharArray();
                characters(charArray2, 0, charArray2.length);
                characters(charArray3, 0, charArray3.length);
            }
        }
    }

    public TextAndAttributeContentHandler(ContentHandler contentHandler, boolean z7) {
        super(contentHandler, z7);
    }
}
