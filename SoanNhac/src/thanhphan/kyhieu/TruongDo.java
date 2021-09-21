package thanhphan.kyhieu;

public enum TruongDo {
    NOT_DEN("1"),
    NOT_TRON("4"),
    NOT_TRANG("2"),
    NOT_MOC_DON("1/2"),
    NOT_MOC_DOI("1/4"),
    NOT_MOC_TAM("1/8"),
    NOT_MOC_TU("1/16");

    private String kyHieu;

    TruongDo(String kyHieu) {
        this.kyHieu = kyHieu;
    }

    @Override
    public String toString() {
        return kyHieu;
    }
}
