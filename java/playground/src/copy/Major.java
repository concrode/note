package copy;

public class Major implements Cloneable{

    private String majorName;

    private long majorId;

    public Major(String majorName, long majorId) {
        this.majorName = majorName;
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public long getMajorId() {
        return majorId;
    }

    public void setMajorId(long majorId) {
        this.majorId = majorId;
    }

    /**
     * If not overriding this function, its shallow copy, otherwise its deep copy.
     * Note that must "implements Cloneable", then override "clone()" function
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
