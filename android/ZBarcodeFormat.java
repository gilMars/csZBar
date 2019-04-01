package org.cloudsky.cordovaPlugins;

import net.sourceforge.zbar.Symbol;

import java.util.List;
import java.util.ArrayList;

public class ZBarcodeFormat {
    private int mId;
    private String mName;
    
    public static final ZBarcodeFormat NONE = new ZBarcodeFormat(Symbol.NONE, "NONE");
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
