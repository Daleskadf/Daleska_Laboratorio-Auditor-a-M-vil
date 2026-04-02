package com.hpplay.component.protocol.plist;
/* loaded from: classes2.dex */
public class NSNumber extends NSObject implements Comparable<Object> {
    public static final int BOOLEAN = 2;
    public static final int INTEGER = 0;
    public static final int REAL = 1;
    private boolean boolValue;
    private double doubleValue;
    private long longValue;
    private int type;

    public NSNumber(byte[] bArr, int i10) {
        this(bArr, 0, bArr.length, i10);
    }

    public boolean boolValue() {
        if (this.type == 2) {
            return this.boolValue;
        }
        if (doubleValue() != 0.0d) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        double doubleValue = doubleValue();
        if (obj instanceof NSNumber) {
            double doubleValue2 = ((NSNumber) obj).doubleValue();
            if (doubleValue < doubleValue2) {
                return -1;
            }
            if (doubleValue == doubleValue2) {
                return 0;
            }
            return 1;
        } else if (!(obj instanceof Number)) {
            return -1;
        } else {
            double doubleValue3 = ((Number) obj).doubleValue();
            if (doubleValue < doubleValue3) {
                return -1;
            }
            if (doubleValue == doubleValue3) {
                return 0;
            }
            return 1;
        }
    }

    public double doubleValue() {
        return this.doubleValue;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NSNumber nSNumber = (NSNumber) obj;
        if (this.type != nSNumber.type || this.longValue != nSNumber.longValue || this.doubleValue != nSNumber.doubleValue || this.boolValue != nSNumber.boolValue) {
            return false;
        }
        return true;
    }

    public float floatValue() {
        return (float) this.doubleValue;
    }

    public int hashCode() {
        long j10 = this.longValue;
        return (((((this.type * 37) + ((int) (j10 ^ (j10 >>> 32)))) * 37) + ((int) (Double.doubleToLongBits(this.doubleValue) ^ (Double.doubleToLongBits(this.doubleValue) >>> 32)))) * 37) + (boolValue() ? 1 : 0);
    }

    public int intValue() {
        return (int) this.longValue;
    }

    public boolean isBoolean() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isInteger() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public boolean isReal() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public long longValue() {
        return this.longValue;
    }

    public String stringValue() {
        int i10 = this.type;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return String.valueOf(boolValue());
                }
                throw new IllegalStateException("The NSNumber instance has an invalid type: " + this.type);
            }
            return String.valueOf(doubleValue());
        }
        return String.valueOf(longValue());
    }

    @Override // com.hpplay.component.protocol.plist.NSObject
    public void toASCII(StringBuilder sb, int i10) {
        String str;
        indent(sb, i10);
        if (isBoolean()) {
            if (boolValue()) {
                str = "YES";
            } else {
                str = "NO";
            }
            sb.append(str);
            return;
        }
        sb.append(toString());
    }

    @Override // com.hpplay.component.protocol.plist.NSObject
    public void toASCIIGnuStep(StringBuilder sb, int i10) {
        indent(sb, i10);
        int type = type();
        if (type != 0) {
            if (type != 1) {
                if (type == 2) {
                    if (boolValue()) {
                        sb.append("<*BY>");
                        return;
                    } else {
                        sb.append("<*BN>");
                        return;
                    }
                }
                return;
            }
            sb.append("<*R");
            sb.append(toString());
            sb.append(ASCIIPropertyListParser.DATA_END_TOKEN);
            return;
        }
        sb.append("<*I");
        sb.append(toString());
        sb.append(ASCIIPropertyListParser.DATA_END_TOKEN);
    }

    @Override // com.hpplay.component.protocol.plist.NSObject
    public void toBinary(BinaryPropertyListWriter binaryPropertyListWriter) {
        int type = type();
        int i10 = 8;
        if (type != 0) {
            if (type != 1) {
                if (type == 2) {
                    if (boolValue()) {
                        i10 = 9;
                    }
                    binaryPropertyListWriter.write(i10);
                    return;
                }
                return;
            }
            binaryPropertyListWriter.write(35);
            binaryPropertyListWriter.writeDouble(doubleValue());
        } else if (longValue() < 0) {
            binaryPropertyListWriter.write(19);
            binaryPropertyListWriter.writeBytes(longValue(), 8);
        } else if (longValue() <= 255) {
            binaryPropertyListWriter.write(16);
            binaryPropertyListWriter.writeBytes(longValue(), 1);
        } else if (longValue() <= 65535) {
            binaryPropertyListWriter.write(17);
            binaryPropertyListWriter.writeBytes(longValue(), 2);
        } else if (longValue() <= 4294967295L) {
            binaryPropertyListWriter.write(18);
            binaryPropertyListWriter.writeBytes(longValue(), 4);
        } else {
            binaryPropertyListWriter.write(19);
            binaryPropertyListWriter.writeBytes(longValue(), 8);
        }
    }

    public String toString() {
        int type = type();
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    return super.toString();
                }
                return String.valueOf(boolValue());
            }
            return String.valueOf(doubleValue());
        }
        return String.valueOf(longValue());
    }

    @Override // com.hpplay.component.protocol.plist.NSObject
    public void toXML(StringBuilder sb, int i10) {
        indent(sb, i10);
        int type = type();
        if (type != 0) {
            if (type != 1) {
                if (type == 2) {
                    if (boolValue()) {
                        sb.append("<true/>");
                        return;
                    } else {
                        sb.append("<false/>");
                        return;
                    }
                }
                return;
            }
            sb.append("<real>");
            sb.append(doubleValue());
            sb.append("</real>");
            return;
        }
        sb.append("<integer>");
        sb.append(longValue());
        sb.append("</integer>");
    }

    public int type() {
        return this.type;
    }

    public NSNumber(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == 0) {
            long parseLong = BinaryPropertyListParser.parseLong(bArr, i10, i11);
            this.longValue = parseLong;
            this.doubleValue = parseLong;
        } else if (i12 == 1) {
            double parseDouble = BinaryPropertyListParser.parseDouble(bArr, i10, i11);
            this.doubleValue = parseDouble;
            this.longValue = Math.round(parseDouble);
        } else {
            throw new IllegalArgumentException("Type argument is not valid.");
        }
        this.type = i12;
    }

    @Override // com.hpplay.component.protocol.plist.NSObject
    /* renamed from: clone */
    public NSNumber mo35clone() {
        int i10 = this.type;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return new NSNumber(this.boolValue);
                }
                throw new IllegalStateException("The NSNumber instance has an invalid type: " + this.type);
            }
            return new NSNumber(this.doubleValue);
        }
        return new NSNumber(this.longValue);
    }

    public NSNumber(String str) {
        long parseLong;
        if (str != null) {
            boolean z10 = false;
            try {
                if (str.startsWith("0x")) {
                    parseLong = Long.parseLong(str.substring(2), 16);
                } else {
                    parseLong = Long.parseLong(str);
                }
                this.longValue = parseLong;
                this.doubleValue = parseLong;
                this.type = 0;
                return;
            } catch (Exception unused) {
                try {
                    try {
                        double parseDouble = Double.parseDouble(str);
                        this.doubleValue = parseDouble;
                        this.longValue = Math.round(parseDouble);
                        this.type = 1;
                        return;
                    } catch (Exception unused2) {
                        z10 = (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) ? true : true;
                        this.boolValue = z10;
                        if (!z10 && !str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no")) {
                            throw new Exception("not a boolean");
                        }
                        this.type = 2;
                        long j10 = this.boolValue ? 1L : 0L;
                        this.longValue = j10;
                        this.doubleValue = j10;
                        return;
                    }
                } catch (Exception unused3) {
                    throw new IllegalArgumentException("The given string neither represents a double, an int nor a boolean value.");
                }
            }
        }
        throw new IllegalArgumentException("The given string is null and cannot be parsed as number.");
    }

    public NSNumber(int i10) {
        long j10 = i10;
        this.longValue = j10;
        this.doubleValue = j10;
        this.type = 0;
    }

    public NSNumber(long j10) {
        this.longValue = j10;
        this.doubleValue = j10;
        this.type = 0;
    }

    public NSNumber(double d10) {
        this.doubleValue = d10;
        this.longValue = (long) d10;
        this.type = 1;
    }

    public NSNumber(boolean z10) {
        this.boolValue = z10;
        long j10 = z10 ? 1L : 0L;
        this.longValue = j10;
        this.doubleValue = j10;
        this.type = 2;
    }
}
