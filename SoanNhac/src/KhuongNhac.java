import thanhphan.KhoaNhac;
import thanhphan.ONhip;
import thanhphan.SoNhip;

import java.util.ArrayList;
import java.util.Arrays;

public class KhuongNhac {
    private static final int MAX_LENGTH = 6;
    private static final int MIN_LENGTH = 1;
    private KhoaNhac khoaNhac;
    private SoNhip soNhip;
    private ArrayList<ONhip> oNhips;

    public KhuongNhac(KhoaNhac khoaNhac, SoNhip soNhip, ONhip... oNhips) {
        if (oNhips.length < MIN_LENGTH | oNhips.length > MAX_LENGTH)
            throw new IllegalArgumentException("So o nhip >=1 <=6");
        this.khoaNhac = khoaNhac;
        this.soNhip = soNhip;
        this.oNhips = new ArrayList<>();
        this.oNhips.addAll(Arrays.asList(oNhips));
    }

    public void addONhip(ONhip oNhip){
        assert oNhips.size() < 6;
        oNhips.add(oNhip);
    }

    public String print(){
        StringBuilder p = new StringBuilder();
        p.append(khoaNhac.print()).append(" - ").append(soNhip.print());
        for (ONhip oNhip: oNhips){
            p.append(" | ");
            p.append(oNhip.print());
        }
        return p.toString();
    }

    public int demDauLang(){
        int count = 0;
        for (ONhip oNhip: oNhips){
            count += oNhip.demDauLang();
        }
        return count;
    }
}
