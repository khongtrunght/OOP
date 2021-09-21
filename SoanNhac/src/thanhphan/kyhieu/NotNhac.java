package thanhphan.kyhieu;

public class NotNhac implements KyHieu {
    private TruongDo truongDo;
    private CaoDo caoDo;

    public NotNhac(TruongDo truongDo, CaoDo caoDo) {
        this.truongDo = truongDo;
        this.caoDo = caoDo;
    }

   public String print(){
       return caoDo.toString() +
               "(" + truongDo.toString() + ")";
   }
}
