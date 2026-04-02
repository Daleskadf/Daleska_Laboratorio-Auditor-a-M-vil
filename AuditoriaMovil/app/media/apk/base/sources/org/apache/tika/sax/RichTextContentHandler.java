package org.apache.tika.sax;

import D.AbstractC0059i;
import java.io.Writer;
import org.xml.sax.Attributes;
/* loaded from: classes.dex */
public class RichTextContentHandler extends WriteOutContentHandler {
    public RichTextContentHandler(Writer writer) {
        super(writer);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        super.startElement(str, str2, str3, attributes);
        if ("img".equals(str2) && attributes.getValue("alt") != null) {
            String M7 = AbstractC0059i.M("[image: ", attributes.getValue("alt"), "]");
            characters(M7.toCharArray(), 0, M7.length());
        }
        if ("a".equals(str2) && attributes.getValue("name") != null) {
            String M8 = AbstractC0059i.M("[bookmark: ", attributes.getValue("name"), "]");
            characters(M8.toCharArray(), 0, M8.length());
        }
    }
}
