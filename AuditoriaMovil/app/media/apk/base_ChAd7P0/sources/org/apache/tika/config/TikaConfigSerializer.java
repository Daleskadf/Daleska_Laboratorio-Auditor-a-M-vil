package org.apache.tika.config;

import D.AbstractC0059i;
import g7.b;
import g7.d;
import j$.util.Objects;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.tika.detect.CompositeDetector;
import org.apache.tika.detect.CompositeEncodingDetector;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.DefaultEncodingDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.detect.EncodingDetector;
import org.apache.tika.language.translate.DefaultTranslator;
import org.apache.tika.language.translate.Translator;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.CompositeParser;
import org.apache.tika.parser.DefaultParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.parser.multiple.AbstractMultipleParser;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/* loaded from: classes.dex */
public class TikaConfigSerializer {
    private static final b LOG = d.b(TikaConfigSerializer.class);
    private static Map<Class, String> PRIMITIVES;

    /* loaded from: classes.dex */
    public static class MethodTuple {
        Method method;
        String name;
        Class singleParam;

        public MethodTuple(String str, Method method, Class cls) {
            this.name = str;
            this.method = method;
            this.singleParam = cls;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MethodTuple methodTuple = (MethodTuple) obj;
            if (this.name.equals(methodTuple.name) && this.method.equals(methodTuple.method) && this.singleParam.equals(methodTuple.singleParam)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.name, this.method, this.singleParam);
        }
    }

    /* loaded from: classes.dex */
    public static class MethodTuples {
        Map<String, Set<MethodTuple>> tuples;

        public /* synthetic */ MethodTuples(int i7) {
            this();
        }

        public void add(MethodTuple methodTuple) {
            Set<MethodTuple> set = this.tuples.get(methodTuple.name);
            if (set == null) {
                set = new HashSet<>();
                this.tuples.put(methodTuple.name, set);
            }
            set.add(methodTuple);
        }

        public int getSize() {
            return this.tuples.size();
        }

        private MethodTuples() {
            this.tuples = new TreeMap();
        }
    }

    /* loaded from: classes.dex */
    public enum Mode {
        MINIMAL,
        CURRENT,
        STATIC,
        STATIC_FULL
    }

    static {
        HashMap hashMap = new HashMap();
        PRIMITIVES = hashMap;
        hashMap.put(Integer.class, "int");
        PRIMITIVES.put(Integer.TYPE, "int");
        PRIMITIVES.put(String.class, "string");
        PRIMITIVES.put(Boolean.class, "bool");
        PRIMITIVES.put(Boolean.TYPE, "bool");
        PRIMITIVES.put(Float.class, "float");
        PRIMITIVES.put(Float.TYPE, "float");
        PRIMITIVES.put(Double.class, "double");
        PRIMITIVES.put(Double.TYPE, "double");
        PRIMITIVES.put(Long.class, "long");
        PRIMITIVES.put(Long.TYPE, "long");
        PRIMITIVES.put(Map.class, "map");
        PRIMITIVES.put(List.class, "list");
    }

    private static void addDetectors(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        Detector detector = tikaConfig.getDetector();
        if (mode == Mode.MINIMAL && (detector instanceof DefaultDetector)) {
            element.appendChild(document.createComment("for example: <detectors><detector class=\"org.apache.tika.detector.MimeTypes\"></detectors>"));
            return;
        }
        Element createElement = document.createElement("detectors");
        if ((mode == Mode.CURRENT && (detector instanceof DefaultDetector)) || !(detector instanceof CompositeDetector)) {
            Element createElement2 = document.createElement("detector");
            createElement2.setAttribute("class", detector.getClass().getCanonicalName());
            createElement.appendChild(createElement2);
        } else {
            for (Detector detector2 : ((CompositeDetector) detector).getDetectors()) {
                Element createElement3 = document.createElement("detector");
                createElement3.setAttribute("class", detector2.getClass().getCanonicalName());
                serializeParams(document, createElement3, detector2);
                createElement.appendChild(createElement3);
            }
        }
        element.appendChild(createElement);
    }

    private static void addEncodingDetectors(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        EncodingDetector encodingDetector = tikaConfig.getEncodingDetector();
        if (mode == Mode.MINIMAL && (encodingDetector instanceof DefaultEncodingDetector)) {
            element.appendChild(document.createComment("for example: <encodingDetectors><encodingDetector class=\"org.apache.tika.detect.DefaultEncodingDetector\"></encodingDetectors>"));
            return;
        }
        Element createElement = document.createElement("encodingDetectors");
        if ((mode == Mode.CURRENT && (encodingDetector instanceof DefaultEncodingDetector)) || !(encodingDetector instanceof CompositeEncodingDetector)) {
            Element createElement2 = document.createElement("encodingDetector");
            createElement2.setAttribute("class", encodingDetector.getClass().getCanonicalName());
            createElement.appendChild(createElement2);
        } else {
            for (EncodingDetector encodingDetector2 : ((CompositeEncodingDetector) encodingDetector).getDetectors()) {
                Element createElement3 = document.createElement("encodingDetector");
                createElement3.setAttribute("class", encodingDetector2.getClass().getCanonicalName());
                serializeParams(document, createElement3, encodingDetector2);
                createElement.appendChild(createElement3);
            }
        }
        element.appendChild(createElement);
    }

    private static void addExecutorService(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        tikaConfig.getExecutorService();
    }

    private static void addList(Element element, Document document, MethodTuple methodTuple, List<String> list) {
        for (String str : list) {
            Element createElement = document.createElement("string");
            createElement.setTextContent(str);
            element.appendChild(createElement);
        }
    }

    private static void addMap(Element element, Document document, MethodTuple methodTuple, Map<String, String> map) {
        for (Map.Entry entry : new TreeMap(map).entrySet()) {
            Element createElement = document.createElement("string");
            createElement.setAttribute(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, (String) entry.getKey());
            createElement.setAttribute(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (String) entry.getValue());
            element.appendChild(createElement);
        }
    }

    private static void addMimeComment(Mode mode, Element element, Document document) {
        element.appendChild(document.createComment("for example: <mimeTypeRepository resource=\"/org/apache/tika/mime/tika-mimetypes.xml\"/>"));
    }

    private static void addParser(Mode mode, Element element, Document document, Parser parser) {
        ParserDecorator parserDecorator;
        if ((parser instanceof ParserDecorator) && parser.getClass().getName().startsWith(ParserDecorator.class.getName().concat("$"))) {
            ParserDecorator parserDecorator2 = (ParserDecorator) parser;
            parserDecorator = parserDecorator2;
            parser = parserDecorator2.getWrappedParser();
        } else {
            parserDecorator = null;
        }
        List<Parser> emptyList = Collections.emptyList();
        boolean z7 = true;
        if (mode != Mode.CURRENT || !(parser instanceof DefaultParser)) {
            if (parser instanceof CompositeParser) {
                emptyList = ((CompositeParser) parser).getAllComponentParsers();
                z7 = true ^ parser.getClass().equals(CompositeParser.class);
                if ((parser instanceof DefaultParser) && (mode == Mode.STATIC || mode == Mode.STATIC_FULL)) {
                    z7 = false;
                }
            } else if (parser instanceof AbstractMultipleParser) {
                emptyList = ((AbstractMultipleParser) parser).getAllParsers();
            }
        }
        if (z7) {
            element = addParser(mode, element, document, parser, parserDecorator);
        }
        for (Parser parser2 : emptyList) {
            addParser(mode, element, document, parser2);
        }
    }

    private static void addParsers(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        Parser parser = tikaConfig.getParser();
        Mode mode2 = Mode.MINIMAL;
        if (mode == mode2 && (parser instanceof DefaultParser)) {
            return;
        }
        if (mode == mode2) {
            mode = Mode.CURRENT;
        }
        Element createElement = document.createElement("parsers");
        element.appendChild(createElement);
        addParser(mode, createElement, document, parser);
    }

    private static void addServiceLoader(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        ServiceLoader serviceLoader = tikaConfig.getServiceLoader();
        if (mode == Mode.MINIMAL && serviceLoader.isDynamic() && serviceLoader.getLoadErrorHandler() == LoadErrorHandler.IGNORE) {
            return;
        }
        Element createElement = document.createElement("service-loader");
        createElement.setAttribute("dynamic", Boolean.toString(serviceLoader.isDynamic()));
        createElement.setAttribute("loadErrorHandler", serviceLoader.getLoadErrorHandler().toString());
        element.appendChild(createElement);
    }

    private static void addTranslator(Mode mode, Element element, Document document, TikaConfig tikaConfig) {
        Translator translator = tikaConfig.getTranslator();
        if (mode == Mode.MINIMAL && (translator instanceof DefaultTranslator)) {
            element.appendChild(document.createComment("for example: <translator class=\"org.apache.tika.language.translate.GoogleTranslator\"/>"));
            return;
        }
        if ((translator instanceof DefaultTranslator) && (mode == Mode.STATIC || mode == Mode.STATIC_FULL)) {
            translator = ((DefaultTranslator) translator).getTranslator();
        }
        if (translator != null) {
            Element createElement = document.createElement("translator");
            createElement.setAttribute("class", translator.getClass().getCanonicalName());
            element.appendChild(createElement);
            return;
        }
        element.appendChild(document.createComment("No translators available"));
    }

    private static Method findGetter(MethodTuple methodTuple, Object obj) {
        Method[] methods;
        Matcher matcher = Pattern.compile("\\A(?:get|is)([A-Z].+)\\Z").matcher(StringUtils.EMPTY);
        for (Method method : obj.getClass().getMethods()) {
            if (obj.getClass().getName().contains("PDF")) {
                System.out.println(method.getName());
            }
            if (matcher.reset(method.getName()).find()) {
                if (obj.getClass().getName().contains("PDF")) {
                    System.out.println("2: " + method.getName());
                }
                if (methodTuple.name.equals(matcher.group(1))) {
                    if (methodTuple.singleParam.equals(method.getReturnType())) {
                        return method;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private static String methodToParamName(String str) {
        if (StringUtils.isBlank(str)) {
            return str;
        }
        return AbstractC0059i.z(str.substring(0, 1).toLowerCase(Locale.US), str.substring(1));
    }

    private static MethodTuple pickBestSetter(Set<MethodTuple> set) {
        Iterator<MethodTuple> it = set.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    private static void processNonPrimitive(String str, Set<MethodTuple> set, Set<MethodTuple> set2, Document document, Element element, Object obj) {
        for (MethodTuple methodTuple : set) {
            for (MethodTuple methodTuple2 : set2) {
                if (methodTuple.singleParam.equals(methodTuple2.singleParam)) {
                    serializeObject(str, document, element, methodTuple, methodTuple2, obj);
                    return;
                }
            }
        }
    }

    public static void serialize(TikaConfig tikaConfig, Mode mode, Writer writer, Charset charset) {
        Document newDocument = XMLReaderUtils.getDocumentBuilder().newDocument();
        Element createElement = newDocument.createElement("properties");
        newDocument.appendChild(createElement);
        addMimeComment(mode, createElement, newDocument);
        addServiceLoader(mode, createElement, newDocument, tikaConfig);
        addExecutorService(mode, createElement, newDocument, tikaConfig);
        addEncodingDetectors(mode, createElement, newDocument, tikaConfig);
        addTranslator(mode, createElement, newDocument, tikaConfig);
        addDetectors(mode, createElement, newDocument, tikaConfig);
        addParsers(mode, createElement, newDocument, tikaConfig);
        Transformer transformer = XMLReaderUtils.getTransformer();
        transformer.setOutputProperty("indent", "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty("encoding", charset.name());
        transformer.transform(new DOMSource(newDocument), new StreamResult(writer));
    }

    private static void serializeNonPrimitives(Document document, Element element, Object obj, MethodTuples methodTuples, MethodTuples methodTuples2) {
        for (Map.Entry<String, Set<MethodTuple>> entry : methodTuples.tuples.entrySet()) {
            processNonPrimitive(entry.getKey(), entry.getValue(), methodTuples2.tuples.get(entry.getKey()), document, element, obj);
            if (!methodTuples2.tuples.containsKey(entry.getKey())) {
                LOG.p(entry.getKey(), obj.getClass(), "no getter for setter non-primitive: {} in {}");
            }
        }
    }

    private static void serializeObject(String str, Document document, Element element, MethodTuple methodTuple, MethodTuple methodTuple2, Object obj) {
        try {
            Object invoke = methodTuple2.method.invoke(obj, null);
            if (invoke == null) {
                LOG.p(methodTuple2.name, obj.getClass(), "Getter {} on {} returned null");
            }
            Element createElement = document.createElement(str);
            createElement.setAttribute("class", invoke.getClass().getCanonicalName());
            element.appendChild(createElement);
            serializeParams(document, element, invoke);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            b bVar = LOG;
            Class<?> cls = obj.getClass();
            bVar.g("couldn't get " + str + " on " + cls, e7);
        }
    }

    public static void serializeParams(Document document, Element element, Object obj) {
        Matcher matcher;
        Method[] methodArr;
        boolean z7;
        Matcher matcher2 = Pattern.compile("\\Aset([A-Z].*)").matcher(StringUtils.EMPTY);
        Matcher matcher3 = Pattern.compile("\\A(?:get|is)([A-Z].+)\\Z").matcher(StringUtils.EMPTY);
        MethodTuples methodTuples = new MethodTuples(0);
        MethodTuples methodTuples2 = new MethodTuples(0);
        MethodTuples methodTuples3 = new MethodTuples(0);
        MethodTuples methodTuples4 = new MethodTuples(0);
        Method[] methods = obj.getClass().getMethods();
        int length = methods.length;
        int i7 = 0;
        while (i7 < length) {
            Method method = methods[i7];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (matcher2.reset(method.getName()).find()) {
                if (!Modifier.isPublic(method.getModifiers())) {
                    LOG.w("inaccessible setter: {} in {}", method.getName(), obj.getClass());
                } else if (method.getAnnotation(Field.class) != null) {
                    if (parameterTypes.length != 1) {
                        methodArr = methods;
                        LOG.l("setter with wrong number of params " + method.getName() + StringUtils.SPACE + parameterTypes.length);
                        matcher = matcher2;
                        z7 = false;
                    } else {
                        methodArr = methods;
                        String methodToParamName = methodToParamName(matcher2.group(1));
                        matcher = matcher2;
                        z7 = false;
                        if (PRIMITIVES.containsKey(parameterTypes[0])) {
                            methodTuples2.add(new MethodTuple(methodToParamName, method, parameterTypes[0]));
                        } else {
                            methodTuples.add(new MethodTuple(methodToParamName, method, parameterTypes[0]));
                        }
                    }
                }
                matcher = matcher2;
                methodArr = methods;
                z7 = false;
            } else {
                matcher = matcher2;
                methodArr = methods;
                z7 = false;
                if (matcher3.reset(method.getName()).find() && parameterTypes.length == 0) {
                    String methodToParamName2 = methodToParamName(matcher3.group(1));
                    if (PRIMITIVES.containsKey(method.getReturnType())) {
                        methodTuples4.add(new MethodTuple(methodToParamName2, method, method.getReturnType()));
                    } else {
                        methodTuples3.add(new MethodTuple(methodToParamName2, method, method.getReturnType()));
                    }
                }
            }
            i7++;
            matcher2 = matcher;
            methods = methodArr;
        }
        serializePrimitives(document, element, obj, methodTuples2, methodTuples4);
        serializeNonPrimitives(document, element, obj, methodTuples, methodTuples3);
    }

    private static void serializePrimitives(Document document, Element element, Object obj, MethodTuples methodTuples, MethodTuples methodTuples2) {
        MethodTuples methodTuples3;
        Element element2;
        String obj2;
        MethodTuples methodTuples4 = methodTuples2;
        if (obj instanceof AbstractMultipleParser) {
            element2 = document.createElement("params");
            Element createElement = document.createElement("param");
            createElement.setAttribute("name", "metadataPolicy");
            createElement.setAttribute(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, ((AbstractMultipleParser) obj).getMetadataPolicy().toString());
            element2.appendChild(createElement);
            element.appendChild(element2);
            methodTuples3 = methodTuples;
        } else {
            methodTuples3 = methodTuples;
            element2 = null;
        }
        Element element3 = element2;
        for (Map.Entry<String, Set<MethodTuple>> entry : methodTuples3.tuples.entrySet()) {
            if (!methodTuples4.tuples.containsKey(entry.getKey())) {
                LOG.z("no getter for setter: {} in {}", entry.getKey(), obj.getClass());
            } else {
                Set<MethodTuple> value = entry.getValue();
                MethodTuple methodTuple = null;
                for (MethodTuple methodTuple2 : methodTuples4.tuples.get(entry.getKey())) {
                    Iterator<MethodTuple> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (methodTuple2.singleParam.equals(it.next().singleParam)) {
                            methodTuple = methodTuple2;
                            break;
                        }
                    }
                }
                if (methodTuple == null) {
                    LOG.q(entry.getKey(), "Could not find getter to match setter for: {}");
                } else {
                    try {
                        try {
                            Object invoke = methodTuple.method.invoke(obj, null);
                            if (invoke == null) {
                                LOG.v("null value: {} in {}", methodTuple.name, obj.getClass());
                            }
                            if (invoke == null) {
                                obj2 = StringUtils.EMPTY;
                            } else {
                                obj2 = invoke.toString();
                            }
                            Element createElement2 = document.createElement("param");
                            createElement2.setAttribute("name", methodTuple.name);
                            createElement2.setAttribute("type", PRIMITIVES.get(methodTuple.singleParam));
                            if (List.class.isAssignableFrom(methodTuple.singleParam)) {
                                addList(createElement2, document, methodTuple, (List) invoke);
                            } else if (Map.class.isAssignableFrom(methodTuple.singleParam)) {
                                addMap(createElement2, document, methodTuple, (Map) invoke);
                            } else {
                                createElement2.setTextContent(obj2);
                            }
                            if (element3 == null) {
                                Element createElement3 = document.createElement("params");
                                element.appendChild(createElement3);
                                element3 = createElement3;
                            }
                            element3.appendChild(createElement2);
                        } catch (IllegalAccessException e7) {
                            e = e7;
                            b bVar = LOG;
                            bVar.j("couldn't invoke " + methodTuple, e);
                            methodTuples4 = methodTuples2;
                        } catch (InvocationTargetException e8) {
                            e = e8;
                            b bVar2 = LOG;
                            bVar2.j("couldn't invoke " + methodTuple, e);
                            methodTuples4 = methodTuples2;
                        }
                    } catch (IllegalAccessException e9) {
                        e = e9;
                    } catch (InvocationTargetException e10) {
                        e = e10;
                    }
                    methodTuples4 = methodTuples2;
                }
            }
            methodTuples4 = methodTuples2;
        }
    }

    private static Element addParser(Mode mode, Element element, Document document, Parser parser, ParserDecorator parserDecorator) {
        ParseContext parseContext = new ParseContext();
        TreeSet treeSet = new TreeSet();
        TreeSet treeSet2 = new TreeSet();
        if (parserDecorator != null) {
            TreeSet treeSet3 = new TreeSet(parserDecorator.getSupportedTypes(parseContext));
            treeSet.addAll(treeSet3);
            for (MediaType mediaType : parser.getSupportedTypes(parseContext)) {
                if (!treeSet3.contains(mediaType)) {
                    treeSet2.add(mediaType);
                }
                treeSet.remove(mediaType);
            }
        } else if (mode == Mode.STATIC_FULL) {
            treeSet.addAll(parser.getSupportedTypes(parseContext));
        }
        String canonicalName = parser.getClass().getCanonicalName();
        Element createElement = document.createElement(ExternalParsersConfigReaderMetKeys.PARSER_TAG);
        createElement.setAttribute("class", canonicalName);
        element.appendChild(createElement);
        serializeParams(document, createElement, parser);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Element createElement2 = document.createElement("mime");
            createElement2.appendChild(document.createTextNode(((MediaType) it.next()).toString()));
            createElement.appendChild(createElement2);
        }
        Iterator it2 = treeSet2.iterator();
        while (it2.hasNext()) {
            Element createElement3 = document.createElement("mime-exclude");
            createElement3.appendChild(document.createTextNode(((MediaType) it2.next()).toString()));
            createElement.appendChild(createElement3);
        }
        return createElement;
    }
}
