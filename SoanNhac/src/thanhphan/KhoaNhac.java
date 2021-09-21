package thanhphan;

import thanhphan.kyhieu.KyHieu;

public enum KhoaNhac implements KyHieu {
    SOL {
        @Override
        public String print() {
            return "Sol";
        }
    }, LA {
        @Override
        public String print() {
            return "La";
        }
    }, FA {
        @Override
        public String print() {
            return "Fa";
        }
    }
}
