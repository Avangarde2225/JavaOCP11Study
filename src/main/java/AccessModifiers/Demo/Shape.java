package AccessModifiers.Demo;

public abstract class Shape {
    public String toWkt() {
        String wkt = this.convertToWkt();

        if (this.isWkitValid(wkt)) {
            return wkt;
        }
        throw new RuntimeException("Cannot draw the shape");
    }

    protected abstract String convertToWkt();

    private boolean isWkitValid(String wkt) {
        if (wkt == null || wkt.length() == 0) {
            return false;
        }
        return wkt.startsWith("POINT") || wkt.startsWith("LINESTRING") || wkt.startsWith("POLYGN");
    }
}
