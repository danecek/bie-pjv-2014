package composition;

public class Rect extends Component {

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int width;
    int height;

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String compToString() {
        return "[" + width + ", " + height + "]";
    }

    @Override
    public void visitedBy(Visitor visitor) {
        visitor.visitRect(this);
    }

}
