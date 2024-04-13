package board;

public class NumberBoard {
    Integer value;
    Boolean isSpecial;

    public NumberBoard(Integer value, Boolean isSpecial) {
        this.value = value;
        this.isSpecial = isSpecial;
    }

    public Integer getValue() {
        return value;
    }

    public Boolean getSpecial() {
        return isSpecial;
    }
}
