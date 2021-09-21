package thanhphan;

import thanhphan.kyhieu.DauLang;
import thanhphan.kyhieu.KyHieu;

import java.util.ArrayList;

public class ONhip implements KyHieu {
    private static final int MAX_LENGTH = 16;
    ArrayList<KyHieu> kyHieus;

    public ONhip(ArrayList<KyHieu> kyHieus) {
        this.kyHieus = kyHieus;
    }

    public ONhip(){
        this.kyHieus = new ArrayList<>();
    }

    public void addKyHieu(KyHieu kyHieu){
        assert kyHieus.size() < 16;
        kyHieus.add(kyHieu);
    }

    @Override
    public String print() {
        StringBuilder p = new StringBuilder();
        for ( KyHieu kyHieu: kyHieus){
            p.append(kyHieu.print());
            p.append(" ");
        }
        return p.toString();
    }

    public int demDauLang(){
        int count = 0;
        for (KyHieu kyHieu: kyHieus){
            if (kyHieu instanceof DauLang){
                count ++;
            }
        }
        return count;
    }
}
