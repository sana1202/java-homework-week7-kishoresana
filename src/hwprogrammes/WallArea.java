package hwprogrammes;

public class WallArea {

        public static class Wall { // public class with two instance variables

            private double width;
            private double height;

            public Wall() { // no-arg constructor
            }

            public Wall(double width, double height) { // parameterized constructor setting width & height
                setWidth(width);
                setHeight(height);
            }

            public double getWidth() { // Method returning width
                return width;
            }

            public double getHeight() { // Method returning height
                return height;
            }

            public void setWidth(double width) { // method setting width
                if (width < 0) {
                    this.width = 0;
                } else {
                    this.width = width;
                }
            }

            public void setHeight(double height) { // method setting height
                if (height < 0) {
                    this.height = 0;
                } else {
                    this.height = height;
                }
            }

            public double getArea() { // method calculating area and returning it
                return this.getWidth() * this.getHeight();
            }
        }

        public static void main(String[] args) {
            Wall wall = new Wall (5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }
    }

