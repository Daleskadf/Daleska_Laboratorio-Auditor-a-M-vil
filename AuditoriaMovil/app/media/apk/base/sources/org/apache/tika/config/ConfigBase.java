package org.apache.tika.config;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/* loaded from: classes.dex */
public abstract class ConfigBase {
    private static Class[] SUPPORTED_PRIMITIVES = {String.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, Double.TYPE, Float.TYPE};

    /* loaded from: classes.dex */
    public static class SetterClassPair {
        private final Class itemClass;
        private final Method setterMethod;

        public SetterClassPair(Method method, Class cls) {
            this.setterMethod = method;
            this.itemClass = cls;
        }

        public String toString() {
            Method method = this.setterMethod;
            Class cls = this.itemClass;
            return "SetterClassPair{setterMethod=" + method + ", itemClass=" + cls + "}";
        }
    }

    private static <T> T buildClass(Node node, String str, Class cls) {
        String name = cls.getName();
        Node namedItem = node.getAttributes().getNamedItem("class");
        if (namedItem != null) {
            name = namedItem.getTextContent();
        }
        try {
            Class<?> cls2 = Class.forName(name);
            if (cls.isAssignableFrom(cls2)) {
                return (T) cls2.getDeclaredConstructor(null).newInstance(null);
            }
            String name2 = cls.getName();
            throw new TikaConfigException(str + " with class name " + name + " must be of type '" + name2 + "'");
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new TikaConfigException(b.i("problem loading ", str, " with class ", cls.getName()), e);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new TikaConfigException(b.i("problem loading ", str, " with class ", cls.getName()), e);
        } catch (InstantiationException e9) {
            e = e9;
            throw new TikaConfigException(b.i("problem loading ", str, " with class ", cls.getName()), e);
        } catch (NoSuchMethodException e10) {
            e = e10;
            throw new TikaConfigException(b.i("problem loading ", str, " with class ", cls.getName()), e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new TikaConfigException(b.i("problem loading ", str, " with class ", cls.getName()), e);
        }
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, InputStream inputStream) {
        try {
            return (P) buildComposite(str, cls, str2, cls2, XMLReaderUtils.buildDOM(inputStream).getDocumentElement());
        } catch (TikaException e7) {
            throw new TikaConfigException("problem loading xml to dom", e7);
        } catch (SAXException e8) {
            throw new IOException(e8);
        }
    }

    public static <T> T buildSingle(String str, Class<T> cls, InputStream inputStream) {
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (documentElement.getLocalName().equals("properties")) {
                return (T) buildSingle(str, cls, documentElement, null);
            }
            throw new TikaConfigException("expect properties as root node");
        } catch (TikaException e7) {
            throw new TikaConfigException("problem loading xml to dom", e7);
        } catch (SAXException e8) {
            throw new IOException(e8);
        }
    }

    private static SetterClassPair findSetterClassPair(Object obj, String str) {
        Method[] methods;
        Method[] methods2;
        String M7 = AbstractC0059i.M("set", str.substring(0, 1).toUpperCase(Locale.US), str.substring(1));
        Method method = null;
        Class<?> cls = null;
        for (Method method2 : obj.getClass().getMethods()) {
            if (M7.equals(method2.getName())) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1 && (cls == null || parameterTypes[0].equals(String.class))) {
                    cls = parameterTypes[0];
                    method = method2;
                }
            }
        }
        if (method != null && cls != null) {
            return new SetterClassPair(method, cls);
        }
        String M8 = AbstractC0059i.M("add", str.substring(0, 1).toUpperCase(Locale.US), str.substring(1));
        for (Method method3 : obj.getClass().getMethods()) {
            if (M8.equals(method3.getName())) {
                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                if (parameterTypes2.length == 1 && (cls == null || parameterTypes2[0].equals(String.class))) {
                    cls = parameterTypes2[0];
                    method = method3;
                }
            }
        }
        if (method == null && cls == null) {
            Class<?> cls2 = obj.getClass();
            StringBuilder l8 = b.l("Couldn't find setter '", M7, "' or adder '", M8, "' for ");
            l8.append(str);
            l8.append(" of class: ");
            l8.append(cls2);
            throw new TikaConfigException(l8.toString());
        }
        return new SetterClassPair(method, cls);
    }

    private static boolean hasChildNodes(Node node) {
        if (!node.hasChildNodes()) {
            return false;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            if (childNodes.item(i7).getNodeType() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasClass(Node node) {
        if (node.hasAttributes() && node.getAttributes().getNamedItem("class") != null) {
            return true;
        }
        return false;
    }

    private static boolean isMap(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1 && item.hasAttributes()) {
                if (item.getAttributes().getNamedItem("from") != null && item.getAttributes().getNamedItem("to") != null) {
                    return true;
                }
                if (item.getAttributes().getNamedItem("k") != null && item.getAttributes().getNamedItem("v") != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isPrimitive(Class cls) {
        int i7 = 0;
        while (true) {
            Class[] clsArr = SUPPORTED_PRIMITIVES;
            if (i7 >= clsArr.length) {
                return false;
            }
            if (clsArr[i7].equals(cls)) {
                return true;
            }
            i7++;
        }
    }

    private static <T> List<T> loadComposite(Node node, String str, Class<? extends T> cls) {
        NodeList childNodes = node.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1 && str.equals(item.getLocalName())) {
                Object buildClass = buildClass(item, str, cls);
                setParams(buildClass, item, new HashSet());
                arrayList.add(buildClass);
            }
        }
        return arrayList;
    }

    private static void setParams(Object obj, Node node, Set<String> set) {
        setParams(obj, node, set, null);
    }

    private static void tryToSetClassList(Object obj, Node node) {
        String localName = node.getLocalName();
        try {
            Class<?> cls = Class.forName(node.getAttributes().getNamedItem("class").getTextContent());
            ArrayList arrayList = new ArrayList();
            NodeList childNodes = node.getChildNodes();
            for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
                Node item = childNodes.item(i7);
                if (item.getNodeType() == 1) {
                    Object buildClass = buildClass(item, item.getLocalName(), cls);
                    setParams(buildClass, item, new HashSet());
                    arrayList.add(buildClass);
                }
            }
            obj.getClass().getMethod("set" + localName.substring(0, 1).toUpperCase(Locale.US) + localName.substring(1), List.class).invoke(obj, arrayList);
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new TikaConfigException(b.h("couldn't build class for ", localName), e);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw new TikaConfigException(b.h("couldn't build class for ", localName), e);
        } catch (NoSuchMethodException e9) {
            e = e9;
            throw new TikaConfigException(b.h("couldn't build class for ", localName), e);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new TikaConfigException(b.h("couldn't build class for ", localName), e);
        }
    }

    private static void tryToSetList(Object obj, Node node) {
        if (hasClass(node)) {
            tryToSetClassList(obj, node);
        } else {
            tryToSetStringList(obj, node);
        }
    }

    private static void tryToSetMap(Object obj, Node node) {
        String str;
        String localName = node.getLocalName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NodeList childNodes = node.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1) {
                NamedNodeMap attributes = item.getAttributes();
                String str2 = null;
                if (attributes.getNamedItem("from") != null) {
                    str = attributes.getNamedItem("from").getTextContent();
                } else if (attributes.getNamedItem(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR) != null) {
                    str = attributes.getNamedItem(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR).getTextContent();
                } else if (attributes.getNamedItem("k") != null) {
                    str = attributes.getNamedItem("k").getTextContent();
                } else {
                    str = null;
                }
                if (attributes.getNamedItem("to") != null) {
                    str2 = attributes.getNamedItem("to").getTextContent();
                } else if (attributes.getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR) != null) {
                    str2 = attributes.getNamedItem(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR).getTextContent();
                } else if (attributes.getNamedItem("v") != null) {
                    str2 = attributes.getNamedItem("v").getTextContent();
                }
                if (str != null) {
                    if (str2 != null) {
                        linkedHashMap.put(str, str2);
                    } else {
                        throw new TikaConfigException("must specify a 'value' or 'to' value in a map object : " + node);
                    }
                } else {
                    throw new TikaConfigException("must specify a 'key' or 'from' value in a map object : " + node);
                }
            }
        }
        try {
            obj.getClass().getMethod(AbstractC0059i.M("set", localName.substring(0, 1).toUpperCase(Locale.US), localName.substring(1)), Map.class).invoke(obj, linkedHashMap);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new TikaConfigException("can't set ".concat(localName), e7);
        }
    }

    private static void tryToSetPrimitive(Object obj, SetterClassPair setterClassPair, String str) {
        try {
            if (setterClassPair.itemClass == Integer.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Integer.valueOf(Integer.parseInt(str)));
            } else if (setterClassPair.itemClass == Long.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Long.valueOf(Long.parseLong(str)));
            } else if (setterClassPair.itemClass == Float.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Float.valueOf(Float.parseFloat(str)));
            } else if (setterClassPair.itemClass == Double.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Double.valueOf(Double.parseDouble(str)));
            } else if (setterClassPair.itemClass == Boolean.TYPE) {
                setterClassPair.setterMethod.invoke(obj, Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                setterClassPair.setterMethod.invoke(obj, str);
            }
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new TikaConfigException("bad parameter " + setterClassPair + StringUtils.SPACE + str, e);
        } catch (InvocationTargetException e8) {
            e = e8;
            throw new TikaConfigException("bad parameter " + setterClassPair + StringUtils.SPACE + str, e);
        }
    }

    private static void tryToSetStringList(Object obj, Node node) {
        String textContent;
        String localName = node.getLocalName();
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1 && (textContent = item.getTextContent()) != null) {
                arrayList.add(textContent);
            }
        }
        try {
            obj.getClass().getMethod(AbstractC0059i.M("set", localName.substring(0, 1).toUpperCase(Locale.US), localName.substring(1)), List.class).invoke(obj, arrayList);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new TikaConfigException("can't set ".concat(localName), e7);
        }
    }

    public Set<String> configure(String str, InputStream inputStream) {
        HashSet hashSet = new HashSet();
        try {
            Element documentElement = XMLReaderUtils.buildDOM(inputStream).getDocumentElement();
            if (documentElement.getLocalName().equals("properties")) {
                NodeList childNodes = documentElement.getChildNodes();
                for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
                    Node item = childNodes.item(i7);
                    if (str.equals(item.getLocalName())) {
                        setParams(this, item, hashSet);
                    }
                }
                return hashSet;
            }
            throw new TikaConfigException("expect properties as root node");
        } catch (TikaException e7) {
            throw new TikaConfigException("problem loading xml to dom", e7);
        } catch (SAXException e8) {
            throw new IOException(e8);
        }
    }

    public void handleSettings(Set<String> set) {
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void setParams(java.lang.Object r11, org.w3c.dom.Node r12, java.util.Set<java.lang.String> r13, java.lang.String r14) {
        /*
            r0 = 1
            org.w3c.dom.NodeList r12 = r12.getChildNodes()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        Lc:
            int r4 = r12.getLength()
            if (r3 >= r4) goto L3b
            org.w3c.dom.Node r4 = r12.item(r3)
            java.lang.String r5 = r4.getLocalName()
            java.lang.String r6 = "params"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L36
            org.w3c.dom.NodeList r4 = r4.getChildNodes()
            r5 = r2
        L27:
            int r6 = r4.getLength()
            if (r5 >= r6) goto L39
            org.w3c.dom.Node r6 = r4.item(r5)
            r1.add(r6)
            int r5 = r5 + r0
            goto L27
        L36:
            r1.add(r4)
        L39:
            int r3 = r3 + r0
            goto Lc
        L3b:
            r12 = r2
        L3c:
            int r3 = r1.size()
            if (r12 >= r3) goto Le3
            java.lang.Object r3 = r1.get(r12)
            org.w3c.dom.Node r3 = (org.w3c.dom.Node) r3
            short r4 = r3.getNodeType()
            if (r4 == r0) goto L50
            goto Le0
        L50:
            java.lang.String r4 = r3.getLocalName()
            if (r4 == 0) goto Le0
            boolean r5 = r4.equals(r14)
            if (r5 == 0) goto L5e
            goto Le0
        L5e:
            java.lang.String r5 = r3.getTextContent()
            java.lang.String r6 = r3.getLocalName()
            org.apache.tika.config.ConfigBase$SetterClassPair r7 = findSetterClassPair(r11, r6)
            boolean r8 = hasClass(r3)
            if (r8 != 0) goto L96
            java.lang.Class r8 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L86
            boolean r8 = isMap(r3)
            if (r8 == 0) goto L86
            tryToSetMap(r11, r3)
            goto Lcb
        L86:
            java.lang.Class r8 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            java.lang.Class<java.util.List> r9 = java.util.List.class
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L96
            tryToSetList(r11, r3)
            goto Lcb
        L96:
            java.lang.Class r8 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            boolean r8 = isPrimitive(r8)
            if (r8 == 0) goto La8
            java.lang.String r3 = r3.getTextContent()
            tryToSetPrimitive(r11, r7, r3)
            goto Lcb
        La8:
            java.lang.Class r8 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            java.lang.Object r8 = buildClass(r3, r6, r8)
            java.lang.Class r9 = org.apache.tika.config.ConfigBase.SetterClassPair.a(r7)
            java.lang.Object r9 = r9.cast(r8)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            setParams(r9, r3, r10)
            java.lang.reflect.Method r3 = org.apache.tika.config.ConfigBase.SetterClassPair.b(r7)     // Catch: java.lang.reflect.InvocationTargetException -> Ld1 java.lang.IllegalAccessException -> Ld3
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> Ld1 java.lang.IllegalAccessException -> Ld3
            r7[r2] = r8     // Catch: java.lang.reflect.InvocationTargetException -> Ld1 java.lang.IllegalAccessException -> Ld3
            r3.invoke(r11, r7)     // Catch: java.lang.reflect.InvocationTargetException -> Ld1 java.lang.IllegalAccessException -> Ld3
        Lcb:
            if (r5 == 0) goto Le0
            r13.add(r4)
            goto Le0
        Ld1:
            r11 = move-exception
            goto Ld4
        Ld3:
            r11 = move-exception
        Ld4:
            org.apache.tika.exception.TikaConfigException r12 = new org.apache.tika.exception.TikaConfigException
            java.lang.String r13 = "problem creating "
            java.lang.String r13 = io.flutter.plugins.pathprovider.b.h(r13, r6)
            r12.<init>(r13, r11)
            throw r12
        Le0:
            int r12 = r12 + r0
            goto L3c
        Le3:
            boolean r12 = r11 instanceof org.apache.tika.config.Initializable
            if (r12 == 0) goto Lf3
            org.apache.tika.config.Initializable r11 = (org.apache.tika.config.Initializable) r11
            java.util.Map r12 = java.util.Collections.EMPTY_MAP
            r11.initialize(r12)
            org.apache.tika.config.InitializableProblemHandler r12 = org.apache.tika.config.InitializableProblemHandler.THROW
            r11.checkInitialization(r12)
        Lf3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.config.ConfigBase.setParams(java.lang.Object, org.w3c.dom.Node, java.util.Set, java.lang.String):void");
    }

    public static <P, T> P buildComposite(String str, Class<P> cls, String str2, Class<T> cls2, Element element) {
        if (element.getLocalName().equals("properties")) {
            NodeList childNodes = element.getChildNodes();
            for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
                Node item = childNodes.item(i7);
                if (item.getNodeType() == 1 && str.equals(item.getLocalName())) {
                    try {
                        P newInstance = cls.getConstructor(List.class).newInstance(loadComposite(item, str2, cls2));
                        setParams(newInstance, item, new HashSet(), str2);
                        return newInstance;
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
                        throw new TikaConfigException("can't build composite class", e7);
                    }
                }
            }
            throw new TikaConfigException(b.h("could not find ", str));
        }
        throw new TikaConfigException("expect properties as root node");
    }

    public static <T> T buildSingle(String str, Class<T> cls, Element element, T t7) {
        NodeList childNodes = element.getChildNodes();
        T t8 = null;
        for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() == 1 && str.equals(item.getLocalName())) {
                if (t8 == null) {
                    t8 = (T) buildClass(item, str, cls);
                    setParams(t8, item, new HashSet());
                } else {
                    throw new TikaConfigException(AbstractC0059i.M("There can only be one ", str, " in a config"));
                }
            }
        }
        if (t8 == null) {
            if (t7 != null) {
                return t7;
            }
            throw new TikaConfigException(b.h("could not find ", str));
        }
        return t8;
    }
}
