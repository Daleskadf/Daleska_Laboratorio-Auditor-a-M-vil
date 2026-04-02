package org.apache.tika.parser.external;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import org.apache.tika.exception.TikaException;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
/* loaded from: classes.dex */
public final class ExternalParsersConfigReader implements ExternalParsersConfigReaderMetKeys {
    private static String getString(Element element) {
        StringBuilder sb = new StringBuilder();
        NodeList childNodes = element.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 3) {
                sb.append(item.getNodeValue());
            }
        }
        return sb.toString();
    }

    public static List<ExternalParser> read(InputStream inputStream) {
        try {
            return read(XMLReaderUtils.getDocumentBuilder().parse(new InputSource(inputStream)));
        } catch (SAXException e7) {
            throw new TikaException("Invalid parser configuration", e7);
        }
    }

    private static boolean readCheckTagAndCheck(Element element) {
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        String str = null;
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals(ExternalParsersConfigReaderMetKeys.COMMAND_TAG)) {
                    str = getString(element2);
                }
                if (element2.getTagName().equals(ExternalParsersConfigReaderMetKeys.ERROR_CODES_TAG)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(getString(element2), ",");
                    while (stringTokenizer.hasMoreElements()) {
                        try {
                            arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (str == null) {
            return true;
        }
        String[] split = str.split(StringUtils.SPACE);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return ExternalParser.check(split, iArr);
    }

    private static Map<Pattern, String> readMetadataPatterns(Element element) {
        HashMap hashMap = new HashMap();
        NodeList childNodes = element.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals("match")) {
                    hashMap.put(Pattern.compile(getString(element2)), element2.getAttribute(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR));
                }
            }
        }
        return hashMap;
    }

    private static Set<MediaType> readMimeTypes(Element element) {
        HashSet hashSet = new HashSet();
        NodeList childNodes = element.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals("mime-type")) {
                    hashSet.add(MediaType.parse(getString(element2)));
                }
            }
        }
        return hashSet;
    }

    private static ExternalParser readParser(Element element) {
        ExternalParser externalParser = new ExternalParser();
        NodeList childNodes = element.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String tagName = element2.getTagName();
                tagName.getClass();
                char c8 = 65535;
                switch (tagName.hashCode()) {
                    case -450004177:
                        if (tagName.equals(ExternalParsersConfigReaderMetKeys.METADATA_TAG)) {
                            c8 = 0;
                            break;
                        }
                        break;
                    case 94627080:
                        if (tagName.equals(ExternalParsersConfigReaderMetKeys.CHECK_TAG)) {
                            c8 = 1;
                            break;
                        }
                        break;
                    case 950394699:
                        if (tagName.equals(ExternalParsersConfigReaderMetKeys.COMMAND_TAG)) {
                            c8 = 2;
                            break;
                        }
                        break;
                    case 1081186720:
                        if (tagName.equals(ExternalParsersConfigReaderMetKeys.MIMETYPES_TAG)) {
                            c8 = 3;
                            break;
                        }
                        break;
                }
                switch (c8) {
                    case 0:
                        externalParser.setMetadataExtractionPatterns(readMetadataPatterns(element2));
                        continue;
                    case 1:
                        if (readCheckTagAndCheck(element2)) {
                            continue;
                        } else {
                            return null;
                        }
                    case 2:
                        externalParser.setCommand(getString(element2));
                        continue;
                    case 3:
                        externalParser.setSupportedTypes(readMimeTypes(element2));
                        continue;
                    default:
                        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("reaction not defined for ", element2.getTagName()));
                }
            }
        }
        return externalParser;
    }

    public static List<ExternalParser> read(Document document) {
        return read(document.getDocumentElement());
    }

    public static List<ExternalParser> read(Element element) {
        ExternalParser readParser;
        ArrayList arrayList = new ArrayList();
        if (element != null && element.getTagName().equals(ExternalParsersConfigReaderMetKeys.EXTERNAL_PARSERS_TAG)) {
            NodeList childNodes = element.getChildNodes();
            for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
                Node item = childNodes.item(i7);
                if (item.getNodeType() == 1) {
                    Element element2 = (Element) item;
                    if (element2.getTagName().equals(ExternalParsersConfigReaderMetKeys.PARSER_TAG) && (readParser = readParser(element2)) != null) {
                        arrayList.add(readParser);
                    }
                }
            }
            return arrayList;
        }
        throw new MimeTypeException(io.flutter.plugins.pathprovider.b.h("Not a <external-parsers/> configuration document: ", element != null ? element.getTagName() : "n/a"));
    }
}
