package org.cloudsky.cordovaPlugins;

import net.sourceforge.zbar.Symbol;

import java.util.List;
import java.util.ArrayList;

public class ZBarcodeFormat {
    private int mId;
    private String mName;

    public static final ZBarcodeFormat NONE = new ZBarcodeFormat(Symbol.NONE, "NONE");
    public static final ZBarcodeFormat PARTIAL = new ZBarcodeFormat(Symbol.PARTIAL, "PARTIAL");
    public static final ZBarcodeFormat EAN8 = new ZBarcodeFormat(Symbol.EAN8, "EAN8");
    public static final ZBarcodeFormat UPCE = new ZBarcodeFormat(Symbol.UPCE, "UPCE");
    public static final ZBarcodeFormat ISBN10 = new ZBarcodeFormat(Symbol.ISBN10, "ISBN10");
    public static final ZBarcodeFormat UPCA = new ZBarcodeFormat(Symbol.UPCA, "UPCA");
    public static final ZBarcodeFormat EAN13 = new ZBarcodeFormat(Symbol.EAN13, "EAN13");
    public static final ZBarcodeFormat ISBN13 = new ZBarcodeFormat(Symbol.ISBN13, "ISBN13");
    public static final ZBarcodeFormat I25 = new ZBarcodeFormat(Symbol.I25, "I25");
    public static final ZBarcodeFormat DATABAR = new ZBarcodeFormat(Symbol.DATABAR, "DATABAR");
    public static final ZBarcodeFormat DATABAR_EXP = new ZBarcodeFormat(Symbol.DATABAR_EXP, "DATABAR_EXP");
    public static final ZBarcodeFormat CODABAR = new ZBarcodeFormat(Symbol.CODABAR, "CODABAR");
    public static final ZBarcodeFormat CODE39 = new ZBarcodeFormat(Symbol.CODE39, "CODE39");
    public static final ZBarcodeFormat PDF417 = new ZBarcodeFormat(Symbol.PDF417, "PDF417");
    public static final ZBarcodeFormat CODE93 = new ZBarcodeFormat(Symbol.CODE93, "CODE93");
    public static final ZBarcodeFormat CODE128 = new ZBarcodeFormat(Symbol.CODE128, "CODE128");

    public static final List<ZBarcodeFormat> ALL_FORMATS = new ArrayList<ZBarcodeFormat>();

    static {
        ALL_FORMATS.add(ZBarcodeFormat.CODE128);
    }

    public ZBarcodeFormat(int id, String name) {
        mId = id;
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public static ZBarcodeFormat getFormatById(int id) {
        for(ZBarcodeFormat format : ALL_FORMATS) {
            if(format.getId() == id) {
                return format;
            }
        }
        return ZBarcodeFormat.NONE;
    }
}
