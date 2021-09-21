import thanhphan.KhoaNhac;
import thanhphan.ONhip;
import thanhphan.SoNhip;
import thanhphan.kyhieu.CaoDo;
import thanhphan.kyhieu.DauLang;
import thanhphan.kyhieu.NotNhac;
import thanhphan.kyhieu.TruongDo;

public class Main {
    public static void main(String[] args) {
        KhoaNhac sol = KhoaNhac.SOL;
        SoNhip soNhip = new SoNhip(2,4);
        ONhip oNhip = new ONhip();
        oNhip.addKyHieu(new NotNhac(TruongDo.NOT_DEN, CaoDo.DO));
        oNhip.addKyHieu(new NotNhac(TruongDo.NOT_MOC_DOI, CaoDo.MI));
        oNhip.addKyHieu(new DauLang(TruongDo.NOT_MOC_TAM));

        ONhip oNhip2 = new ONhip();
        oNhip2.addKyHieu(new NotNhac(TruongDo.NOT_DEN, CaoDo.DO));
        oNhip2.addKyHieu(new NotNhac(TruongDo.NOT_MOC_DOI, CaoDo.MI));
        oNhip2.addKyHieu(new DauLang(TruongDo.NOT_MOC_TAM));
        KhuongNhac chinh = new KhuongNhac(sol, soNhip, oNhip, oNhip2);
        System.out.println(chinh.print());
        System.out.println(chinh.demDauLang());
    }
}
