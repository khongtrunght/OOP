package thanhphan;

import thanhphan.kyhieu.KyHieu;

public class SoNhip implements KyHieu {
    private int tuSo;
    private int mauSo;

    public SoNhip(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    @Override
    public String print() {
        return Integer.toString(tuSo) + "/" + Integer.toString(mauSo);
    }

}
