package maxhyper.dtupgradeaquatic.cells;

import com.ferreusveritas.dynamictrees.cells.MatrixCell;

public class RiverLeafCell extends MatrixCell {

    public RiverLeafCell(int value) {
        super(value, valMap);
    }

    static final byte[] valMap = {
            0, 1, 2, 0, 2, 0, 0, 0, //D Maps
            0, 1, 2, 3, 4, 0, 0, 0, //U Maps
            0, 1, 2, 0, 2, 0, 0, 0, //N Maps
            0, 1, 2, 0, 2, 0, 0, 0, //S Maps
            0, 1, 2, 0, 2, 0, 0, 0, //W Maps
            0, 1, 2, 0, 2, 0, 0, 0  //E Maps
    };

}
