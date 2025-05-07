package objclasspractice.general;

public class Books {

    private String page;
    private String ink;
    private int pageNo;
    private double lineNo;
    private String cover;
    private float list;
    private String colour;

    public Books() {
    }

    public Books(String page, String ink, int pageNo, double lineNo, String cover, float list, String colour) {
        this.page = page;
        this.ink = ink;
        this.pageNo = pageNo;
        this.lineNo = lineNo;
        this.cover = cover;
        this.list = list;
        this.colour = colour;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getInk() {
        return ink;
    }

    public void setInk(String ink) {
        this.ink = ink;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public double getLineNo() {
        return lineNo;
    }

    public void setLineNo(double lineNo) {
        this.lineNo = lineNo;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public float getList() {
        return list;
    }

    public void setList(float list) {
        this.list = list;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Books{" + "page=" + page + ", ink=" + ink + ", pageNo=" + pageNo + ", lineNo=" + lineNo + ", cover=" + cover + ", list=" + list + ", colour=" + colour + '}';
    }

    
    
    
}
