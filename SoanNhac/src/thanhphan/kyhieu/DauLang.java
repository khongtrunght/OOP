package thanhphan.kyhieu;

public class DauLang implements KyHieu {
    private TruongDo truongDo;

    public DauLang(TruongDo truongDo) {
        this.truongDo = truongDo;
    }

    @Override
    public String print() {
        return "Lang(" + truongDo.toString() + ")";
    }
}
