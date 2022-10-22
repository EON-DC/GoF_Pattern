package iterator;

public interface Iterator {
    boolean next();
    /**
     * 받아온 Aggregator의 길이를 참조하여, 추가로 반환할 것이 있는지 여부에 대해
     * 있으면 true, 없으면 false를 반환한다.
     */

    Object current();
    /**
     * 현재 인덱스를 참조하여 Object 를 반환한다.
     */
}
